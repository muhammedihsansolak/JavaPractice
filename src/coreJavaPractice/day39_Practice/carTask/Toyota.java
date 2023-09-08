package coreJavaPractice.day39_Practice.carTask;

public class Toyota extends Car{

    public Toyota(String model, String color, int year, int miles, double price) {
        super("Toyota", model, color, year, miles, price);
    }

    public void reliable(){
        System.out.println(getBrand()+" "+getModel()+" is very reliable");
    }

}
