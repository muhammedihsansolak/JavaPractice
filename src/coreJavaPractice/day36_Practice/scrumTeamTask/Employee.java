package coreJavaPractice.day36_Practice.scrumTeamTask;

public class Employee extends Person{

    int ID;
    String jobTitle;
    double salary;

    public void setInfo(String name, int age, char gender,int ID, String jobTitle, double salary) {
        setInfo(name,age,gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    void work(){
        System.out.println(name+" is working");
    }
}
/*
Create a sub class of Person named Employee
			Extra variables:
				id, jobTitle, salary

			Extra methods:
				SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
							Hint: after creating setInfo method of employee class, you can call the inheritend setInfo() to set the name, age, and gender

				work()

				toString(): generate toString seperately in Employee class so that name, age, gender, id, jobTitle and salary of the emplyee can be displayed
 */