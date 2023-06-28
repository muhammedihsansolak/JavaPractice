package day15_Practice;

import java.util.Scanner;

public class SumOfUntilAnyGivenNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int givenNumber = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= givenNumber ; i++) {
            sum += i;
        }
        System.out.println("Sum of all numbers until "+givenNumber+ " is " +sum);

        scan.close();
    }
}
/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */