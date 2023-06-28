package day35_Practice.square;

public class Square {

    private double side;

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        if (side <= 0){
            System.err.println("Invalid value");
            return;
        }
        this.side = side;
    }

    public Square(double side) {
        setSide(side);
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public double calcArea(){
        return side*side;
    }

    public double calcPerimeter(){
        return side*4;
    }

}
