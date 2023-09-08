package coreJavaPractice.day17_Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter a valid operator: (+, -, *, /)");
        char ch = scan.next().charAt(0);

        while (true) {

            if (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
                System.out.println("Invalid operator. please re-enter:");
                ch = scan.next().charAt(0);
            } else {
                break;
            }
        }
        int sum = (ch == '+') ? num1 + num2 : (ch == '-') ? num1 - num2 : (ch == '*') ? num1 * num2 : num1 / num2;
        System.out.println(sum);

        scan.close();
    }
}
/*
write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until
		user provides a valid operator (+, -, *, /)
 */