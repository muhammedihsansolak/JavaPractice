package day33_Practice;

public class Car {

    public String make, model, color;
    public double price;
    public int year;

    public static int numberOfWheels = 1;
    public static boolean hasBattery = false, hasSeats = true;

    public Car(String make, String model, String color, double price, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
    public void drive(){
        System.out.println(year+" "+make+" "+model+" is being drove");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Fiat","Marea","Dark blue", 140_000,2001);
        myCar.drive();
        System.out.println(myCar);
    }
}
