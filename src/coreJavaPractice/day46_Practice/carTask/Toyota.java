package coreJavaPractice.day46_Practice.carTask;

public class Toyota extends Car {

    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    void reliable() {
        System.out.println(brand + " " + model + " is reliable");
    }

    //because start() method is instance and does not have private or final keyword we can override it

    @Override //==> if it does not give compiler error it is an overriden method
    void start() { //we can give public, or protected access modifier or we can keep it as it is
        System.out.println("Twist the key to ignition to start "+brand+" "+model);
    }
}
