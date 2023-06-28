package day38_Practice.shapeTask;

public class Square extends Shape{

    double side;
    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    double area() {
        return side*side;
    }
    @Override
    double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "shapeTask.Shape{" +
                "name='" + name + '\'' +
                ", side='" + side + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
