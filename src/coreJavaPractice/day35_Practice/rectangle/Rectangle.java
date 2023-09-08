package coreJavaPractice.day35_Practice.rectangle;

public class Rectangle {
    private double width, length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("Invalid value");
            return;
        }
        this.width = width;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.err.println("Invalid value");
            return;
        }
        this.length = length;
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }

    public double calcArea(){
        return width*length;
    }
    public double calcPerimeter(){
        return (width*2) + (length*2);
    }
}
