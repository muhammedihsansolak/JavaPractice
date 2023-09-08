package coreJavaPractice.day19_Practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("How much you make an hour?");
            double hourlyRate = scan.nextDouble();
            if (hourlyRate <= 0) {
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            int weeklyHour = scan.nextInt();
            if (weeklyHour < 1 || weeklyHour > 144) {
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate:");
            int stateTax = scan.nextInt();
            if (stateTax < 0 || stateTax > 10) {
                System.err.println("Invalid Entry for state tax rate");
                System.exit(0);
            }
            double grossSalary = weeklyHour * hourlyRate * 52,
                    federalTaxAmount = grossSalary * 26 / 100,
                    stateTaxAmount = grossSalary * stateTax / 100,
                    totalTax = federalTaxAmount + stateTaxAmount,
                    netIncome = grossSalary - totalTax;
            System.out.println("Gross Salary:\t" + grossSalary);
            System.out.println("Federal Tax (%26):\t" + federalTaxAmount);
            System.out.println("State tax (" + stateTax + "):\t" + stateTaxAmount);
            System.out.println("Total tax:\t" + totalTax);
            System.out.println("Net Income:\t" + netIncome);
            System.out.println();
            System.out.println("Do you want to continue?");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {

                System.err.println("Invalid response.");
                System.exit(0);
            }
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }
        }
        scan.close();
    }
}
/*
5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
 */