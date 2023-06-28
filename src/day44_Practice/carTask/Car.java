package day44_Practice.carTask;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;

    //----getters----
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    //----setters----

    public void setPrice(double price) {
        if (price<=0) throw new RuntimeException("Invalid price");
        this.price = price;
    }

    public void setColor(String color) {
        if (color.isEmpty()||color.isBlank()) throw new RuntimeException("Invalid color");
        this.color = color;
    }

    //----constructor----

    public Car(String make, String model, int year, double price, String color) {
        if (make.isEmpty()||make.isBlank()) throw new RuntimeException("Invalid make");
        this.make = make;
        if (model.isEmpty()||model.isBlank()) throw new RuntimeException("Invalid model");
        this.model = model;
        if (year<1886) throw new RuntimeException("Invalid year");
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println("Press the brake for stop");
    }

    @Override
    public String toString() {
        return   getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=$" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
