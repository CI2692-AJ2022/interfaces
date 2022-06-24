public class Main {

    public static void main(String[] args) {

        // Create all employees in company
        Employee empleado1 = new Employee();
        empleado1.randomData();
        Employee empleado2 = new Employee();
        empleado2.randomData();
        Employee empleado3 = new Employee();
        empleado3.randomData();
        Employee empleado4 = new Employee();
        empleado4.randomData();

        // Assign only DIRECT subordinates for an employee
        empleado1.setSubordinates(empleado2);
        empleado2.setSubordinates(empleado3);
        empleado3.setSubordinates(empleado4);


        // Test of two implementation, showing employees
        System.out.println("Nombre: " +empleado1.getName() + ". Edad: " + empleado1.getAge() + ". Salario: " + empleado1.getSalary());
        System.out.println("Nombre: " +empleado2.getName() + ". Edad: " + empleado2.getAge() + ". Salario: " + empleado2.getSalary());
        System.out.println("Nombre: " +empleado3.getName() + ". Edad: " + empleado3.getAge() + ". Salario: " + empleado3.getSalary());
        System.out.println("Nombre: " +empleado4.getName() + ". Edad: " + empleado4.getAge() + ". Salario: " + empleado4.getSalary());

        System.out.println("\n Calculando los subornidados con la condición (aplicando recursiòn)");
        System.out.println(empleado1.employeesOldLowerRecursive(empleado1));
        System.out.println("\n Calculando los subordinados con la condición (aplicando iteración y queues)");
        System.out.println(empleado1.employeesOldLower(empleado1));

    }
}