package coreJavaPractice.day15_Practice;

import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int givenNum = scan.nextInt();
        int factorial = 1;

        for (int i = 1; i <= givenNum; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of "+givenNum+" is "+factorial);

        scan.close();
    }
}
/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */