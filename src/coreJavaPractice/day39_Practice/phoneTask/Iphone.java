package coreJavaPractice.day39_Practice.phoneTask;

public class Iphone extends Phone {

    public Iphone(String model, String color, double size, double price) {
        super("Apple", model, color, size, price);
    }
    public void faceTime(String number) {
        System.out.println(getBrand() + " " + getModel() + " is face-time with +" + number);
    }
    public void faceTimeWithEMail(String email) {
        System.out.println(getBrand() + " " + getModel() + " is face-time with +" + email);
    }
}
