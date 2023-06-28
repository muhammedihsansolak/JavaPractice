package day39_Practice.phoneTask;

public class Samsung extends Phone{

    public Samsung(String model, String color, double size, double price) {
        super("Samsung", model, color, size, price);
    }

    public void freeze(){
        System.out.println(getBrand()+" "+getModel()+" is freezing");
    }

}
