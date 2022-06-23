import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> emptySubs = new ArrayList<>();

        Employee employee2 = new Employee("Antonio", 25, 80, emptySubs);
        Employee employee3 = new Employee("Pedro", 30, 20, emptySubs);
        Employee employee4 = new Employee("Alfonso", 32, 15, emptySubs);

        ArrayList<Employee> employee5_subs = new ArrayList<>();
        employee5_subs.add(employee4);
        employee5_subs.add(employee3);
        employee5_subs.add(employee2);
        Employee employee5 = new Employee("Jose", 40, 30, employee5_subs);

        Employee employee11 = new Employee("Nestor", 70, 10, emptySubs);

        ArrayList<Employee> employee10_subs = new ArrayList<>();
        employee10_subs.add(employee11);
        Employee employee10 = new Employee("Ramona", 21, 80, employee10_subs);
        Employee employee9 = new Employee("Mario", 22, 40, emptySubs);

        ArrayList<Employee> employee6_subs = new ArrayList<>();
        employee6_subs.add(employee10);
        employee6_subs.add(employee9);
        Employee employee6 = new Employee("Maria", 22, 10, employee6_subs);

        Employee employee7 = new Employee("Antonia", 35, 70, emptySubs);

        ArrayList<Employee> employee8_subs = new ArrayList<>();
        employee8_subs.add(employee7);
        employee8_subs.add(employee6);
        employee8_subs.add(employee5);
        Employee employee8 = new Employee("Juan", 23, 40, employee8_subs);



        System.out.println(employee8.olderAndPoorer());
        System.out.println(employee8.olderAndPoorerQueue());
    }
}