package day39_Practice.carTask;

public class Car {
    //Instance varibales
    private String brand, model, color;
    private int year, miles;
    private double price;

    //getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Constructor with setters
    public Car(String brand, String model, String color, int year, int miles, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setYear(year);
        setMiles(miles);
        setPrice(price);
    }

    //toString method
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=$" + price +
                '}';
    }

    //Instance methods
    public void drive(String location){
        System.out.println(getBrand()+" "+getModel()+" is driving to "+location);
    }
}
