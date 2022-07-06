import java.util.List;

public class Employee {

    private String name;
    private int age;
    private double wage;
    private List<Employee> subordinates;

    public int calculateOlderAndPoorerRecursive() {
        if(subordinates.isEmpty()) {
            return 0;
        }
        int sumOfEmployees = 0;
        for (Employee employee: subordinates) {
            sumOfEmployees += calculateOlderAndPoorerRecursiveThan(this.age, this.wage, employee);
        }
        return sumOfEmployees;
    }

    private int calculateOlderAndPoorerRecursiveThan(int age, double wage, Employee employee) {
        int sumOfEmployees = 0;
        if(employee.age > age && employee.wage > wage) {
            sumOfEmployees++;
        }
        for (Employee subordinate: subordinates) {
            sumOfEmployees += calculateOlderAndPoorerRecursiveThan(age, wage, subordinate);
        }
        return sumOfEmployees;
    }

    public int calculateOlderAndPoorerIterative() {
        MyQueueInterface myQueue = new MyQueue();
        Employee current;
        int count = 0;
        for(Employee employee : this.subordinates) {
            myQueue.add(employee);
        }
        while (myQueue.size() > 0) {
            current = myQueue.poll();
            if(current.age > this.age && current.wage < this.wage) {
                count++;
            }
            for(Employee employee: current.subordinates) {
                myQueue.add(employee);
            }
        }
        return count;
    }

}