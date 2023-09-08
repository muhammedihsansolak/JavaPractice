package coreJavaPractice.day19_Practice;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("===> Welcome to Cydeo Circle Calculator APP! <===");
        while (true) {
            System.out.println("\nEnter the \"radius\" of the circle:");
            double radious = scan.nextDouble();
            while (radious <= 0) {
                System.err.println("===Invalid Entry for the radius of the circle===");
                System.exit(0);
            }

            double diameter = 2 * radious;
            double area = 3.14 * radious * radious;
            double perimeter = 2 * 3.14 * radious;

            System.out.println("Diameter of circle: " + diameter + "\nArea of circle: " + area + "\nPerimeter of circle: " + perimeter);
            System.out.println();
            System.out.println("Would you like to calculate another circle?");
            String answer = scan.next().toLowerCase();
            while ( ! (answer.equals("yes") || answer.equals("no"))  ){

                System.err.println("Invalid response. Please enter either YES or NO");
                answer = scan.next().toLowerCase();

            }
            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP. Have a nice day!");
                break;
            }
        }
        scan.close();
    }
}
/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */