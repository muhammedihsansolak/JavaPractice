package coreJavaPractice.shapeTask;

public class Square extends Shape{

    private double side;

    //---getters---
    public double getSide(){
        return side;
    }

    //---setters---
    public void setSide(double side){
        if(side <= 0) throw new RuntimeException("Invalid side: "+side);
        this.side = side;
    }

    //---constructor---
    public Square(double side){
        super("Square");
        setSide(side);
    }

    public double area(){
        return side*side;
    }

    public double perimeter(){
        return side*4;
    }

    public String toString(){
        return "Square{" +
                "name = " + getName() +
                ", side = " + side +
                ", area = " + area() +
                ", perimeter = " + perimeter() +
                "}";
    }
}
