import java.util.ArrayList;

public class Employee {
    String name;
    int age;
    double salary;
    ArrayList<Employee> subordinates;
    private int count;

    Employee(String name, int age, double salary, ArrayList<Employee> subordinates){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.subordinates = subordinates;
    }

    public Integer olderAndPoorer(){
        count = 0;
        return olderAndPoorer(subordinates);
    }
    private Integer olderAndPoorer(ArrayList<Employee> subordinatesList) {
        if (subordinatesList.size() > 0){
            for (Employee employee : subordinatesList) {
                if (employee.age > age && employee.salary < salary) {
                    count++;
                }
                olderAndPoorer(employee.subordinates);
            }
        }
        return count;
    }

    public Integer olderAndPoorerQueue(){
        count = 0;
        createSubordinatesQueue(subordinates);
        int size = queue.size();
        int i = 0;
        while (i < size){
            if (queue.peek().age > age && queue.peek().salary < salary){
                count++;
            }
            queue.poll();
            i++;
        }
        return count;
    }

    MyQueueArrayList queue = new MyQueueArrayList();
    private void createSubordinatesQueue(ArrayList<Employee> subordinateList){
        for (Employee employee : subordinateList){
            queue.add(employee);
            if (employee.subordinates.size() > 0){
                createSubordinatesQueue(employee.subordinates);
            }
        }
    }
}
