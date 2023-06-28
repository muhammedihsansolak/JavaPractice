package day37_Practice;

public class Server extends Employee {
    public Server(String name, int age, char gender, int ID, double salary, boolean fullTime) {
        super(name, age, gender, "Server", ID, salary, fullTime);
    }

    void takeOrder() {
        System.out.println(jobTitle + " " + name + " is taking an order");
    }

    void cleanTable() {
        System.out.println(jobTitle + " " + name + " is cleaning the table");
    }
}
