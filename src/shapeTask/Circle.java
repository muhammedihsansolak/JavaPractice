package shapeTask;

public class Circle extends Shape{
    //instance variables
    private double radius;

    public static final double PI;
    static{
        PI = 3.14;
    }

    //---getters---
    public double getRadius(){
        return radius;
    }

    //---setters---
    public void setRadius(double radius){
        if (radius <= 0){
            System.err.println("Invalid radius: "+radius);
            return;
        }
        this.radius = radius;
    }

    //---constructor---
    public Circle(double radius){
        super("Circle");
        setRadius(radius);
    }
    @Override
    public double area(){
        return PI*radius*radius;
    }
    @Override
    public double perimeter(){
        return 2*PI*radius;
    }

    //---toString---
    public String toString(){
        return "Circle{" +
                "name = " + getName() +
                ", radius = "+ radius +
                ", PI = " + PI +
                ", area = " + area() +
                ", perimeter = " + perimeter() +
                "}";
    }

}
