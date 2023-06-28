package day08_Practice;

public class MaximNumber {
    /*
    Write a program that can print the maximum number between two numbers, if both are equal then print Equal

                Ex:
                    n1= 100, n2 = 200;

                output:
                    200 is maximum number
     */
    public static void main(String[] args) {

        int n1 = 123,
                n2 = 124;

        boolean n1IsMax = n1 > n2;
        boolean n2IsMax = n2 > n1;
        boolean equal = n1 == n2;
        if (n1IsMax) {//if n1 is maximum number
            System.out.println(n1+ " is the maximum number");
        }
        if (n2IsMax){//n2 is maximum number
            System.out.println(n2+" is the maximum number");
        }
        if (equal){//if n1 is equal n2
            System.out.println("Equal");
        }


    }
}
