package coreJavaPractice.day18_Practice;

import java.util.Scanner;

public class FibonacciSequence2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int numUntil = scan.nextInt();

        int num1 = 0,
                num2 = 1;
        System.out.print(num1+", "+ num2);
        for (int i = 0; i < numUntil; i++) {
            int num3 = num1 + num2;
            System.out.print(", "+num3);
            num1 = num2;
            num2 = num3;

        }

        scan.close();
    }
}
