package day33_Practice;
/*
2. Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
 */
public class Circle {

    /*public double radius;
    public double diameter = 2*radius;

    It is not working, here is why ==> When you declare an instance variable like public double radius;, it is automatically initialized to the default value of 0.0. So, when you try to initialize diameter using 2*radius, radius is still 0.0, and therefore diameter will also be 0.0. Note that if you initialize radius in a constructor or a method, you need to make sure that it is initialized before you use it to calculate diameter.
    */

    //instance variables -->
    public double radius, diameter;
    //static variable -->
    public static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = 2* radius;
    }
    public double calcArea(){
       return PI*radius*radius;
    }

    public double calcPerimeter(){
        return PI*radius*2;
    }
    public void printPI(){
        System.out.println("PI value is: "+PI);
    }

    public String toString() {
        return "Circle{" +
                "PI=" + Circle.PI +
                ", radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1);
    }
}
