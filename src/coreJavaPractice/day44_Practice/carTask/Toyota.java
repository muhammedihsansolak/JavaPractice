package coreJavaPractice.day44_Practice.carTask;

public class Toyota extends Car{
    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Use the key for ignition");
    }

    @Override
    public void drive() {
        System.out.println("Driving toyota is cool");
    }
}
