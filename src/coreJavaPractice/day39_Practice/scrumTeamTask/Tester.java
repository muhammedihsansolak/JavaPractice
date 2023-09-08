package coreJavaPractice.day39_Practice.scrumTeamTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }
    public void creatingTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating ticket");
    }
}
