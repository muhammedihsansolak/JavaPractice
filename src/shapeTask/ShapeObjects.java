package shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(15);
        Circle circle = new Circle(20);

        Shape shape = new Shape("Ractangle");


        System.out.println(square);
        System.out.println(circle);
        System.out.println(shape);


    }
}
