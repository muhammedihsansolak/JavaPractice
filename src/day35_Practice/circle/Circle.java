package day35_Practice.circle;

public class Circle {

    private double radius;
    public static double PI;

    public Circle(double radius) {
        setRadius(radius);
    }

    static {
        PI = 3.141592653589793;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        if (r<=0){
            System.err.println("Invalid radius");
        }
        radius = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "PI=" + PI +
                '}';
    }

    public double calcArea(){
        return radius*radius*PI;
    }
    public double calcPerimeter(){
        return 2*radius*PI;
    }
}
/*
2. Create a class named Circle

			privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()
 */