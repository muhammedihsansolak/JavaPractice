package coreJavaPractice.day43_Practice.shapeTask;

public final class Circle extends Shape {

    private double radius;
    private static double PI;

    static {
        PI = 3.14159265359;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0) throw new RuntimeException("Invalid radius: "+radius);
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*PI;
    }

    @Override
    public double perimeter() {
        return 2*radius*PI;
    }
}
