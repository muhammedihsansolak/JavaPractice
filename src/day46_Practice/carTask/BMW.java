package day46_Practice.carTask;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color, int miles){
        super("BMW",model,year,price,color,miles);
    }
    void breaksDown(){
        System.out.println(model+" "+model+" has broke down");
    }
    void racing(){
        System.out.println(model+" "+model+" is racing");
    }
    @Override
    public void start(){
        System.out.println("Call mechanic to jump start "+brand+" "+model);
    }
}
