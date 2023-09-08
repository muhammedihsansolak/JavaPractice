package coreJavaPractice.day09_Practice;

public class FINRA {

    public static void main(String[] args) {

        int num1 = 150;

        if (num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.println("FINRA");
        } else if (num1 % 3 == 0) {
            System.out.println("FIN");
        } else if (num1 % 5 == 0) {
            System.out.println("RA");
        } else {

        }

    }
}
/*
Create a class called FINRA, Write a function which prints out the number. but for number which is a
multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA"
instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
            output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA
 */