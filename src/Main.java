import java.lang.*;

public class Main {

//Call countEmployers and countEmployersWithQueueMethods with these parameters: (employer, employer, true)

    public static void main(String[] args) {
        Employer employer = new Employer("Alejandro", 20, 10000);
        employer.addEmployer("Pedro", 28, 8000);
        employer.addEmployer("Jorge", 28, 8000);
        employer.queueOfEmployers.queue.get(0).addEmployer("Luis", 30, 300);
        employer.queueOfEmployers.queue.get(0).addEmployer("Daniel", 30, 30000);
        employer.queueOfEmployers.queue.get(0).addEmployer("Pepe", 18, 300);
        employer.queueOfEmployers.queue.get(0).queueOfEmployers.queue.get(0).addEmployer("Jose", 30, 500);
        employer.countEmployers(employer, employer, true);
        System.out.println(employer.amountOfEmployers);
        employer.countEmployersWithQueueMethods(employer, employer, true);
        System.out.println(employer.amountOfEmployers);
    }
}