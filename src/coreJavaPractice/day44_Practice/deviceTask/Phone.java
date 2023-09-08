package coreJavaPractice.day44_Practice.deviceTask;

public abstract class Phone extends Device {

    public Phone(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
    public void call(String number){
        System.out.println(getBrand()+" "+getModel()+" is calling +"+number);
    }
    public void text(String number){
        System.out.println(getBrand()+" "+getModel()+" is texting +"+number);
    }


}
