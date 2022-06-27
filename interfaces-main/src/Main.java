import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> arrayfornewemployee = new ArrayList<>();

        Employee employee5 = new Employee("Daniela", 25, 600, arrayfornewemployee);

        Employee employee4 = new Employee("Miguel", 70, 1000, arrayfornewemployee);

        Employee employee3 = new Employee("José", 50, 800, arrayfornewemployee);

        ArrayList<Employee> arrayforemployee2 = new ArrayList<>();
        arrayforemployee2.add(employee3);
        Employee employee2 = new Employee("Juan", 80, 2000, arrayfornewemployee);

        ArrayList<Employee> arrayforemployee1 = new ArrayList<>();
        arrayforemployee1.add(employee2);
        arrayforemployee1.add(employee4);
        arrayforemployee1.add(employee5);
        Employee employee1 = new Employee("Enrique", 68, 5000, arrayforemployee1);

        System.out.println(employee1.EldersRecursive(employee1.bossof));
        System.out.println(employee1.ElderArrayList(employee1.bossof));
        }
    }