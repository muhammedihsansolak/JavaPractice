package coreJavaPractice.day18_Practice;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int price = 0;
        System.out.println("Enter your name:");
        String name = scan.nextLine();

        System.out.println("Enter you gender:");
        String gender = scan.next().toLowerCase();
        while (!(gender.equals("male") || gender.equals("female"))) {
            System.err.println("Invalid entry. Please enter either MALE or FEMALE:");
            gender = scan.next().toLowerCase();
        }

        System.out.println("Enter you age:");
        int age = scan.nextInt();
        while (!(age > 0 && age < 120)) {
            System.err.println("Invalid entry. Please enter your real age:");
            age = scan.nextInt();
        }
        if (age < 25) {
            price += 90;
        } else {
            price += 50;
        }

        System.out.println("How many miles you drive in a day?");
        int miles = scan.nextInt();
        while (!(miles >= 5)) {
            System.err.println("Invalid entry. Miles can not be negative or less than 5. Please re-enter:");
            miles = scan.nextInt();
        }

        if (miles <= 10) {
            price += 10;
        } else if (miles > 10 && miles <= 50) {
            price += 30;
        } else {
            price += 50;
        }

        scan.nextLine();

        System.out.println("Do you want a \"full coverage\" insurance or \"liability\" insurance?");
        String insuranceType = scan.nextLine().toLowerCase();

        while (!(insuranceType.equals("full coverage") || insuranceType.equals("liability"))) {

            System.err.println("Invalid entry. Please select one of them ==> \"full coverage\"or \"liability\"");
            insuranceType = scan.nextLine().toLowerCase();
        }
        if (insuranceType.equals("full coverage") && age < 25) {
            price += 160;
        } else if (insuranceType.equals("full coverage") && age >= 25) {
            price += 120;
        }

        System.out.println("Have you had any accidents or claims in past 5 years? (yes/no)");
        String accidents = scan.nextLine().toLowerCase();
        while (!(accidents.equals("yes") || accidents.equals("no"))) {
            System.err.println("Invalid entry. please enter either YES or NO:");
            accidents = scan.nextLine().toLowerCase();
        }

        System.out.println("Does your car have a anti-theft device? (yes/no)");
        String antiTheft = scan.nextLine();
        while (!(antiTheft.equals("yes") || antiTheft.equals("no"))) {
            System.err.println("Invalid entry. please enter either YES or NO:");
            accidents = scan.nextLine().toLowerCase();
        }


        scan.close();
    }
}
/*
Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount
 */