import java.util.ArrayList;

/**
 *  Class Employee to implement a company structure of employee and subordinate
 */
public class Employee {

    // Initialization of atributes for each employee
    private String name;
    private int age;
    private int salary;
    private ArrayList<Employee> subordinates;


    // Constructor for the object Employee
    public Employee(String nombre, int edad, int salario){
        this.name = nombre;
        this.age= edad;
        this.salary =salario;
        this.subordinates= new ArrayList<>(0);

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
    public int employeesOldLower(Employee person){
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
    public int employeesOldLowerRecursive(Employee person){
        // ArrayList Queue to keep all the subordinates of person
        MyArrayListQueue<Employee> subordinates = new MyArrayListQueue<>();
        int count =0;

        // For the immediately subordinate verify the condition and change count
        for(Employee subordinate: this.getSubordinates()) {
            if (subordinate.getAge() > person.getAge() && subordinate.getSalary() < person.getSalary()) {
                subordinates.add(subordinate);
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
