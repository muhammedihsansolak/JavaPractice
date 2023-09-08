package coreJavaPractice.day44_Practice.deviceTask;

public class Samsung extends Phone implements AndroidApps{

    public Samsung(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    protected void turnOn() {

    }

    @Override
    protected void turnOff() {

    }

    @Override
    public void downloadApp() {

    }
}
