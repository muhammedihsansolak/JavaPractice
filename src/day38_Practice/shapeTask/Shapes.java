package day38_Practice.shapeTask;

public class Shapes {
    public static void main(String[] args) {

        Circle circle = new Circle(10.5);
        Rectangle rectangle = new Rectangle(10,15);
        Square square = new Square(12);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        System.out.println("====================");

        System.out.println(circle.radius);
        System.out.println(square.area());
        System.out.println(rectangle.perimeter());

    }
}
