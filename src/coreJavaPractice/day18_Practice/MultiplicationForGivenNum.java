package coreJavaPractice.day18_Practice;

import java.util.Scanner;

public class MultiplicationForGivenNum {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(n+" x " + i + " = " + n*i);

        }

    }
}
/*
Write a Java program that generates a multiplication table for a given number n.
The multiplication table should display the product of n and the numbers 1 through 10.
 */