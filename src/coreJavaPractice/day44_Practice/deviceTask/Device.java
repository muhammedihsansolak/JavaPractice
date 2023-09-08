package coreJavaPractice.day44_Practice.deviceTask;

public abstract class Device {

    private final String brand, model;
    private double price;
    private String color;
    private final char size;
    private boolean hasBattery, hasPowerButton;


    //-------CONSTRUCTOR


    public Device(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            System.err.println("Invalid brand");
            System.exit(1);
        }
        this.brand = brand;
        if (model == null || model.isEmpty() || model.isBlank()) throw new RuntimeException("Invalid model");
        this.model = model;
        setPrice(price);
        setColor(color);
        if (!(size == 'S' || size == 'M' || size == 'L')) throw new RuntimeException("Invalid size");
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }


    //----GETTERS

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public char getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    //------SETTERS

    public void setPrice(double price) {
        if (price <= 0) throw new RuntimeException("Invalid price");
        this.price = price;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            System.err.println("Invalid color");
            System.exit(1);
        }
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }


    //-----ABSTRACT METHODS
    protected abstract void turnOn();

    protected abstract void turnOff();

    //-----ToString

    @Override
    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=$" + price +
                '}';
    }
}
