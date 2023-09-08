package coreJavaPractice.day14_Practice;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter an account number:");
        String word = scan.next();
        char firstChar = word.charAt(0);
        boolean twoOrNot = firstChar == '2';
        boolean fiveOrNot = firstChar == '5';

        if (twoOrNot) {
            if (word.length() >= 7) {
                System.out.println("Congratulations! Your account number is valid.");
            } else {
                System.err.println("Invalid account number");
            }
        } else if (fiveOrNot) {
            if (word.length() >= 10) {
                System.out.println("Congratulations! Your account number is valid.");
            } else {
                System.err.println("Invalid account number");
            }
        } else {
            System.err.println("Invalid account number");
        }
        scan.close();
    }
}
/*
Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */