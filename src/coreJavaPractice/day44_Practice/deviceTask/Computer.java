package coreJavaPractice.day44_Practice.deviceTask;

public abstract class Computer extends Device {

    public Computer(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
}
