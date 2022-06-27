import java.util.ArrayList;

public class Employee {
   
    String name;
    int age;
    int salary;
    ArrayList<Employee> bossof;

    Employee(String name, int age, double salary, ArrayList<Employee> bossof){
        this.name = name;
        this.age = age;
        this.salary = (int) salary;
        this.bossof = bossof;
    }


    public Integer EldersRecursive(ArrayList<Employee> bossofList) {
        int eldersWithLowSalary = 0;
        if (bossof.size() > 0){
            for (Employee employee : bossofList) {
                if (employee.age > age && employee.salary < salary) {
                    eldersWithLowSalary++;
                }
                EldersRecursive(employee.bossof);
            }
        }
        return eldersWithLowSalary;
    }
    
    public Integer ElderArrayList(ArrayList<Employee> bossofList){
        int elders = 0;
        int size = bossofList.size();
        int i = 0;
        while (i < size){
            if (bossofList.get(i).age > age && bossofList.get(i).salary < salary){
                elders++;
            }
            i++;
        }
        return elders;
    }


}
