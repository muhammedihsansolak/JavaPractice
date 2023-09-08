package coreJavaPractice.day35_Practice.circle;

public class CircleObject {

    public static void main(String[] args) {

        Circle c1 = new Circle(12.5);
        System.out.println(c1);
        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimeter());
    }
}
