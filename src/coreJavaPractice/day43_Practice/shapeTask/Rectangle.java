package coreJavaPractice.day43_Practice.shapeTask;

public final class Rectangle extends Shape {

    private double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0) throw new RuntimeException("Invalid width: "+width);
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0) throw new RuntimeException("Invalid length: "+length);
        this.length = length;
    }

    @Override
    public double area() {
        return getWidth()*getLength();
    }

    @Override
    public double perimeter() {
        return 2*(getWidth()+getLength());
    }
}
