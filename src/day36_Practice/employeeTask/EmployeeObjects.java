package day36_Practice.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Max","Tester",'M',23,32463,95000);
        tester.creatingTicket();
        tester.work();
        System.out.println(tester);

        Developer developer = new Developer();
        developer.setInfo("MAxwell Ian","Developer",'M',24,124,115000);
        developer.coding();
        developer.work();
        System.out.println(developer);


    }
}
