package coreJavaPractice.day18_Practice;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even number");
            } else {
                System.out.println(num + " is odd number");
            }
            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();

            while( ! (answer.equals("yes") || answer.equals("no")) ){

                System.err.println("Invalid entry please enter yes/no:");
                answer = scan.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }
        }

        scan.close();
    }
}
/*
Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps
 */