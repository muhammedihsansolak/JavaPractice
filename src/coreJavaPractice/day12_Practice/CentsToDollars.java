package coreJavaPractice.day12_Practice;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter your Cents:");
        int cents = scan.nextInt();
        int dollar = cents/100;
        int remainCents = cents%100;
        System.out.println(cents+ " cents equal to: "+ dollar+ "$ and " + remainCents + " cents.");

        scan.close();
    }
}
/*
Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */