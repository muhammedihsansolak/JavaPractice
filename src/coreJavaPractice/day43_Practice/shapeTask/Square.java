package coreJavaPractice.day43_Practice.shapeTask;

public final class Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square");
       setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0) throw new RuntimeException("Invalid side: "+side);
        this.side = side;
    }

    @Override
    public double area() {
        return getSide()*getSide();
    }

    @Override
    public double perimeter() {
        return getSide()*4;
    }
}
