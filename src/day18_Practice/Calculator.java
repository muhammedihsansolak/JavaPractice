package day18_Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to \"Cydeo Calculator\"");
        while (true) {
            System.out.println("Enter you first number:");
            int num1 = scan.nextInt();
            System.out.println("Enter your second number:");
            int num2 = scan.nextInt();

            System.out.println("Enter one of the operators ==> +, -, /, *");
            char operator = scan.next().charAt(0);
            while (!((operator + "").equals("+") || (operator + "").equals("-") || (operator + "").equals("/") ||
                    (operator + "").equals("*"))) {
                System.err.println("Invalid operator. Please select ==> +, -, /, *");
                operator = scan.next().charAt(0);
            }
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
            }
            System.out.println(num1 + " " + operator + " " + num2 + " is " + result);
            System.out.println("Do you want to continue? (yes/no)");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry. Please type either YES or NO: ");
                answer = scan.next().toLowerCase();
            }
            if (answer.equals("no")){
                System.out.println("Thank for choosing \"Cydeo Calculator\"");
                break;
            }
        }

        scan.close();
    }
}
/*
Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */