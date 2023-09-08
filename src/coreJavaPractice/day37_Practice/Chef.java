package coreJavaPractice.day37_Practice;

public class Chef extends Employee{
    public Chef(String name, int age, char gender, int ID, double salary, boolean fullTime) {
        super(name, age, gender, "Chef", ID, salary, fullTime);
    }

    void makeOrder() {
        System.out.println(jobTitle + " " + name + " is making an order");
    }

    void washDishes() {
        System.out.println(jobTitle + " " + name + " is washing the dishes");
    }

}
