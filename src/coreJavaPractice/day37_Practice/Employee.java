package coreJavaPractice.day37_Practice;

public class Employee extends Person {
    public Employee(String name, int age, char gender, String jobTitle, int ID, double salary, boolean fullTime) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.hourlyRate = salary;
        this.fullTime = fullTime;
    }

    String jobTitle;
    int ID;
    double hourlyRate;
    boolean fullTime;

    String result = (fullTime) ? "Full-Time" : "Part-Time";

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", is full time= " + result +
                ", salary= $" + hourlyRate +
                '}';
    }

    void work() {
        System.out.println(name + " is working");
    }
}
