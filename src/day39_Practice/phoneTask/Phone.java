package day39_Practice.phoneTask;

public class Phone {
    //instance variables with Encapsulation
    private String brand, model, color;
    private double size, price;

    //getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (!(brand.equalsIgnoreCase("Apple") || brand.equalsIgnoreCase("Samsung") || brand.equalsIgnoreCase("Nokia")))
            return;
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
        if (!(color.equalsIgnoreCase("Black") || color.equalsIgnoreCase("White"))) return;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) return;
        this.price = price;
    }
    //constructor with setters
    public Phone(String brand, String model, String color, double size, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
    }
    //toString method
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size + " inc." +
                ", price$=" + price +
                '}';
    }
    //instance methods
    public void call(String number) {
        System.out.println(brand + " " + model + " is calling +" + number);
    }

    public void text(String number) {
        System.out.println(brand + " " + model + " is texting +" + number);
    }
}
