package day44_Practice.deviceTask;

public class Iphone extends Phone implements AppleApps{
    public Iphone(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
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
