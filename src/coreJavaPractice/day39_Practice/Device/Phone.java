package coreJavaPractice.day39_Practice.Device;

public class Phone extends Device{

    public Phone(String brand, String model, double price) {
        super(brand, model, price, true, true);
    }

    public void call(String number){
        System.out.println(getBrand()+" "+getModel()+" is calling +"+number);
    }
    public void text(String number){
        System.out.println(getBrand()+" "+getModel()+" is texting +"+number);
    }
}
