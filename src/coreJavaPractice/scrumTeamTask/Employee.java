package coreJavaPractice.scrumTeamTask;

public class Employee extends Person {
    //-------instance variables-
    private int ID;
    private String jobTitle;
    private double salary;

    //------------GETTER-----------------

    public int getID() {
        return ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }


    //-----------------SETTER-----------------------


    public void setID(int ID) {
        if (ID < 0) {
            System.err.println("Invalid ID");
            return;
        }
        String str = ID + "";
        if (str.length() != 5) {
            System.err.println("Invalid ID");
            return;
        }
        this.ID = ID;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            System.err.println("Invalid job title");
            return;
        }
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Invalid salary");
            return;
        }
        this.salary = salary;
    }

    //-------CONSTRUCTOR---------------------
    public Employee(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender);
        setID(ID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    //-------------toString-------------------

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }

    @Override
    public void drink(String drink) {
        System.out.println(getName() + " is drinking " + drink);
    }

    void work() {
        System.out.println(getName() + " is working");
    }

}
