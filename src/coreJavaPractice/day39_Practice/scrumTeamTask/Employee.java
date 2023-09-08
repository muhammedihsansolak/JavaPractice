package coreJavaPractice.day39_Practice.scrumTeamTask;

public class Employee extends Person{

    private int ID;
    private String jobTitle;
    private double salary;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<= 0 ) return;
        this.salary = salary;
    }

    public Employee(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                '}';
    }

    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is working");
    }

}
