package coreJavaPractice.day35_Practice.carpet;

public class CarpetObject {

    public static void main(String[] args) {

        Carpet c1 = new Carpet(20,15,5.60,false);
        Carpet c2 = new Carpet(10,20,8.20,true);

        System.out.println(c1);
        System.out.println("$"+c1.calcCost());
        System.out.println("===================");
        System.out.println(c2);
        System.out.println("$"+c2.calcCost());
    }
}
