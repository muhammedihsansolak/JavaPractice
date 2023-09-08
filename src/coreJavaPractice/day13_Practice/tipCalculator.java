package coreJavaPractice.day13_Practice;

import java.util.Scanner;

public class tipCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String splitOrNot = scan.next();

        if (splitOrNot.equals("yes")) {
            System.out.println("Enter the number of people");
            int numOfPeople = scan.nextInt();


            System.out.println("Enter the check amount:");
            double bill = scan.nextDouble();

            System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
            String quality = scan.next();

            int tipPercentage = 50;

            if (quality.equals("excellent")) {
                tipPercentage = 25;
            } else if (quality.equals("great")) {
                tipPercentage = 20;
            } else if (quality.equals("good")) {
                tipPercentage = 15;
            } else if (quality.equals("fair")) {
                tipPercentage = 10;
            } else if (quality.equals("poor")) {
                tipPercentage = 5;
            }

            double totalTip = bill * tipPercentage / 100;

            double tipPerPerson = totalTip / numOfPeople;


            System.out.println("Number of people entered: " + numOfPeople);
            System.out.println("Total to pay: " + bill);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Tip per person:" + tipPerPerson);

        } else if (splitOrNot.equals("no")) {
            System.out.println("Enter the check amount:");
            double bill = scan.nextDouble();

            System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
            String quality = scan.next();

            int tipPercentage = 50;

            if (quality.equals("excellent")) {
                tipPercentage = 25;
            } else if (quality.equals("great")) {
                tipPercentage = 20;
            } else if (quality.equals("good")) {
                tipPercentage = 15;
            } else if (quality.equals("fair")) {
                tipPercentage = 10;
            } else if (quality.equals("poor")) {
                tipPercentage = 5;
            }

            double totalTip = bill * tipPercentage / 100;

            System.out.println("Total to pay: " + bill);
            System.out.println("Total tip: " + totalTip);
        }
        scan.close();
    }

}
/*
Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method

 */