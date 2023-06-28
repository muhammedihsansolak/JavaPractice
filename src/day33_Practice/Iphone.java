package day33_Practice;

public class Iphone {

    public String model,color,size;
    public double price;

    public static String brand = "Apple Inc", OS = "iOS", madeIn = "China";

    public Iphone(String model) {
        this.model = model;
    }
    public Iphone(String model, String color) {
        this(model);
        this.color = color;
    }
    public Iphone(String model, String color, String size) {
        this(model, color);
        this.size = size;
    }
    public Iphone(String model, String color, String size, double price) {
        this(model,color,size);
        this.price = price;
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                '}';
    }

    public void faceTime(long telNum){
        System.out.println(model+" is having a face-time conversation with +"+telNum);
    }
    public void faceTime(String email){
        System.out.println(model+" is having a face-time conversation with "+email);
    }
    public void call(long number){
        System.out.println(model+" is calling +"+number);
    }
    public void text(long number){
        System.out.println(model+" is texting to +"+number);
    }

    public static void main(String[] args) {
        Iphone myPhone = new Iphone("12 Pro Max","Blue","7.0",1349);
        System.out.println(myPhone);
        myPhone.faceTime(553729310);
        myPhone.faceTime("Muahmmed@gmail.com");
        myPhone.call(553729310);
        myPhone.text(553729310);
    }

}
/*
4. IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */