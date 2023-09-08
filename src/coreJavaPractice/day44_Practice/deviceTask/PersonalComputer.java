package coreJavaPractice.day44_Practice.deviceTask;

public class PersonalComputer extends Computer{
    public PersonalComputer(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    protected void turnOn() {

    }

    @Override
    protected void turnOff() {

    }
}
