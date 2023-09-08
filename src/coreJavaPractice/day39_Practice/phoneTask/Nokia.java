package coreJavaPractice.day39_Practice.phoneTask;

public class Nokia extends Phone{

    public Nokia(String model, String color, double size, double price) {
        super("Nokia", model, color, size, price);
    }

    public void selfDefense(){
        System.out.println(getBrand()+" "+getModel()+" is also used for self-defense");
    }

}
