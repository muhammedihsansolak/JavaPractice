package coreJavaPractice.day46_Practice.carTask;

public class Tesla extends Car{

    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    void autoPilot(){
        System.out.println(brand+" "+model+" has autopilot mode");
    }

    @Override
    void start() {
        System.out.println("Say \"Start\" to start "+brand+" "+model);
    }
}
