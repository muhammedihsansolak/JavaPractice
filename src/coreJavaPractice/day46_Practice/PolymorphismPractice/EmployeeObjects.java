package coreJavaPractice.day46_Practice.PolymorphismPractice;

import coreJavaPractice.day46_Practice.employee.*;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Developer developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Teacher teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Driver driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        ArrayList<Employee> scrumMembers = new ArrayList<>();
        scrumMembers.addAll(Arrays.asList(teacher,tester,developer,driver));

        ArrayList<Tester> testers = new ArrayList<>();
        testers.add(tester);

        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(developer);


        Employee highestSalary = scrumMembers.get(0);

        for (Employee each : scrumMembers) {
            if (each.getSalary() > highestSalary.getSalary()) highestSalary = each;
        }

        System.out.println("Highest Salary = " + highestSalary.getName()+", "+highestSalary.getJobTitle()+" $"+highestSalary.getSalary());

        System.out.println("=================================");

        Employee lowestSalary = scrumMembers.get(0);

        for (Employee each : scrumMembers) {
            if (each.getSalary() < lowestSalary.getSalary()) lowestSalary = each;
        }

        System.out.println("Lowest Salary = " + lowestSalary.getName()+", "+lowestSalary.getJobTitle()+" $"+lowestSalary.getSalary());
    }
}
