package day39_Practice.Device;

public class TV extends Device{


    public TV(String brand, String model, double price) {
        super(brand, model, price, false, true);
    }

    public void channelUp(){
        System.out.println("Channel has up");
    }
    public void channelDown(){
        System.out.println("Channel has downed");
    }
}
