import java.util.ArrayList;
import java.util.Random;

/**
 *  Class Employee to implement a company structure of employee and subordinate
 */
public class Employee {

    // Initialization of attributes for each employee
    private String name;
    private int age;
    private int salary;
    private ArrayList<Employee> subordinates;


    // Constructor for the object Employee with a given data
    public Employee(String nombre, int edad, int salario){
        this.name = nombre;
        this.age= edad;
        this.salary =salario;
        this.subordinates= new ArrayList<>(0);

    }
    // Constructor for Employee empty
    public Employee(){
        this.name = "";
        this.age = 0;
        this.salary = 0;
    }

    // Generate random data for an employee
    public void randomData(){
        //Random values for employees
        int edadMin = 20;
        int edadMax = 80;
        int salarioMin = 80;
        int salarioMax = 2000;
        String[] nombres= {"Luis", "Maria", "Jesus", "Andrea","Angel","Laura","Miguel"};

        // Randomly Generator
        Random edadRandom = new Random();
        Random salarioRandom  = new Random();
        Random nombreRandom = new Random();

        this.name= nombres[nombreRandom.nextInt(0, nombres.length)];
        this.age = edadRandom.nextInt(edadMin,edadMax+1);
        this.salary = salarioRandom.nextInt(salarioMin,salarioMax+1);
        this.subordinates =new ArrayList<>(0);
    }

    /**
     * Method to set the subordinate as an ArrayList of employees
     * @param subordinate employee to add to list of subordinates for employee
     */
    public void setSubordinates(Employee subordinate){
        if(!this.subordinates.contains(subordinate)){
            this.subordinates.add(subordinate);
        }
    }

    /**
     * Gets  method to access to employee attributes
     *
     */
    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return  this.salary;
    }
    public ArrayList<Employee> getSubordinates(){
        return this.subordinates;
    }

    public int getAge(){
        return this.age;
    }

    /**
     * Function to obtain the count of successors older and
     * lower paid than a given employee. Using recursions.
     *
     * @param person employe to calculate the count of successors
     * @return count of total subordinates with the condition
     */
    public int employeesOldLowerRecursive(Employee person){
        // Variable to keep the subordinates with the condition
        int count=0;
        // Deeply Search for subordinates

        if (this.getSubordinates().size()>0) {
            for (Employee subordinado : this.getSubordinates()) {
                if (subordinado.getAge() > person.getAge() && subordinado.getSalary() < person.getSalary()) {
                    count++;

                }
                // In case the subordinate doesn't follow the condition, but maybe for its subordinates is true
                count += subordinado.employeesOldLower(person);
            }
        }
        return count;
    }


    /**
     * Function to obtain the count of successors older and
     * lower paid than a given employee. In iterative way applying queue
     *
     * @param person employe to calculate the count of successors
     * @return count of total subordinates with the condition
     */
    public int employeesOldLower(Employee person){
        // ArrayList Queue to keep all the subordinates of person
        MyArrayListQueue subordinates = new MyArrayListQueue();
        int count =0;

        // For the immediately subordinate verify the condition and change count
        for(Employee subordinate: this.getSubordinates()) {
            subordinates.add(subordinate);
            if (subordinate.getAge() > person.getAge() && subordinate.getSalary() < person.getSalary()) {
                count ++;
            }
        }
        // Look up for subordinates of subordinates applying depth search (this because queue follow FIFO property)
        while(subordinates.size()>0){
            Employee subordinado = subordinates.poll();
            if(subordinado.getSubordinates().size()>0){
                for(Employee subsubordinate: subordinado.getSubordinates()){
                    subordinates.add(subsubordinate);
                    if (subsubordinate.getAge() > person.getAge() && subsubordinate.getSalary() < person.getSalary()) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
