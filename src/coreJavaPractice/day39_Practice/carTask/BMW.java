package coreJavaPractice.day39_Practice.carTask;

public class BMW extends Car{

    public BMW(String model, String color, int year, int miles, double price) {
        super("BMW", model, color, year, miles, price);
    }
    public void broke(){
        System.out.println(getBrand()+" "+getModel()+" has broken down. Call the mechanic for jump start");
    }

}
