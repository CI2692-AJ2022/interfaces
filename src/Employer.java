// Class Employer

import java.util.ArrayList;

public class Employer {

    public String name; 
    public int age; 
    public int salary; 
    public QueueOfEmployers queueOfEmployers= new QueueOfEmployers();
    public int amountOfEmployers = 0;
    
    Employer(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void addEmployer(String name, int age, int salary){
        Employer newEmployer = new Employer(name, age, salary);
        queueOfEmployers.add(newEmployer);
    }

    public void countEmployers(Employer originalEmployer, Employer currentEmployer, boolean firstCall) {

        if(this.amountOfEmployers > 0 && firstCall) {
            this.amountOfEmployers = 0;
        }
        
        if(originalEmployer.age < currentEmployer.age && originalEmployer.salary > currentEmployer.salary && !firstCall){
            this.amountOfEmployers = this.amountOfEmployers + 1;
        }
        
        for(int i = 0; i < currentEmployer.queueOfEmployers.queue.size(); i++){

            countEmployers(originalEmployer, currentEmployer.queueOfEmployers.queue.get(i), false);
        }
    }
    
    public void countEmployersWithQueueMethods(Employer originalEmployer, Employer currentEmployer, boolean firstCall) {

        if(this.amountOfEmployers > 0 && firstCall) {
            this.amountOfEmployers = 0;
        }

        while(true) {
            Employer newEmployer = currentEmployer.queueOfEmployers.poll();
            if(newEmployer == null) {
                break;
            }

            if(originalEmployer.age < newEmployer.age && originalEmployer.salary > newEmployer.salary){
                this.amountOfEmployers = this.amountOfEmployers + 1;
            }

            countEmployersWithQueueMethods(originalEmployer, newEmployer, false);
            
        }
        
    } 
}