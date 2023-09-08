package coreJavaPractice.day44_Practice.carTask;

public class Honda extends Car{

    public Honda(String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Start the Honda");
    }

    @Override
    public void drive() {
        System.out.println("Driving Honda is cool");
    }
}
