package day38_Practice.shapeTask;

public class Circle extends Shape{

    double radius;
    static double PI;
    static {
        PI = 3.14159265359;
    }
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*PI;
    }
    @Override
    public double perimeter(){
        return (radius*2) * PI;
    }

    @Override
    public String toString() {
        return "shapeTask.Shape{" +
                "name='" + name + '\'' +
                ", radius='" + radius + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
