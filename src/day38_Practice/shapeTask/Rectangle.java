package day38_Practice.shapeTask;

public class Rectangle extends Shape{

    double length, width;
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }
    double perimeter() {
        return (length*2) + (width*2);
    }

    @Override
    public String toString() {
        return "shapeTask.Shape{" +
                "name='" + name + '\'' +
                ", width='" + width + '\'' +
                ", length='" + length + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
