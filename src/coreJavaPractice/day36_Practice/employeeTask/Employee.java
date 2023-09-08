package coreJavaPractice.day36_Practice.employeeTask;

public class Employee {

    String name, jobTitle;
    char gender;
    int age, ID;
    double salary;

    public void setInfo(String name, String jobTitle, char gender, int age, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", salary=£" + salary +
                '}';
    }
    public void work(){
        System.out.println(name+" is working");
    }
}
