import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create all employees in company
        Employee empleado1 = new Employee("Fulano",46,2000);
        Employee empleado2 = new Employee("Mengano",50,1000);
        Employee empleado3 = new Employee("Sotano",51,1000);
        Employee empleado4 = new Employee("Pengano",52,1000);

        // Assign only DIRECT subordinates for an employee
        empleado1.setSubordinates(empleado2);
        empleado2.setSubordinates(empleado3);
        empleado3.setSubordinates(empleado4);

        // Test of two implementation
        System.out.println("\n Calculando los subornidados aplicando recursiòn");
        System.out.println(empleado1.employeesOldLowerRecursive(empleado1));
        System.out.println("\n Calculando los subordinados aplicando iteración y queues ");
        System.out.println(empleado1.employeesOldLower(empleado1));

    }
}