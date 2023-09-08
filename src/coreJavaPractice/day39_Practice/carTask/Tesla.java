package coreJavaPractice.day39_Practice.carTask;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, int miles, double price) {
        super("Tesla", model, color, year, miles, price);
    }

    public void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+" has auto-pilot");
    }

}
