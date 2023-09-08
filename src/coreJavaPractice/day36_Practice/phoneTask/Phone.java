package coreJavaPractice.day36_Practice.phoneTask;

public class Phone {

    String brand, model, color;
    char size;
    double price;

    public void setInfo(String brand, String model, char size,double price, String color){
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println("Calling : "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("Texting : "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=$" + price +
                '}';
    }
}
