package coreJavaPractice.day15_Practice;

import java.util.Scanner;

public class CarInsurance {
    public static void main(String[] args) {

        System.out.println("Welcome to the Cydeo car insurance!");
        Scanner scan = new Scanner(System.in);
        double premiumCost = 0;

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Do you have a US driver license?");
        String usDriverLicence = scan.next();
        if (usDriverLicence.equalsIgnoreCase("no")){
            System.err.println("You must have a license to get insurance!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        if (zipCode == 20910 || zipCode == 20740){
            premiumCost +=60;
        } else if (zipCode == 22102 || zipCode == 22103) {
            premiumCost += 30;
        }else {
            premiumCost += 50;
        }


        System.out.println("Is this vehicle owned, financed, or leased?");
        String isOwnedOrFinancedOrLeased = scan.next();
        if (isOwnedOrFinancedOrLeased.toLowerCase().equals("owned")){
            premiumCost += 10;
        } else if (isOwnedOrFinancedOrLeased.toLowerCase().equals("financed")) {
            premiumCost +=15;
        }else if (isOwnedOrFinancedOrLeased.toLowerCase().equals("leased")){
            premiumCost +=20;
        }

        System.out.println("How is this vehicle primarily used?");
        String forUsage = scan.next();
        if (forUsage.toLowerCase().equals("business")){
            premiumCost +=50;
        } else if (forUsage.equalsIgnoreCase("pleasure")) {
            premiumCost +=10;
        } else if (forUsage.equalsIgnoreCase("commuting")) {
            premiumCost +=20;
            System.out.println("How many days do you commute?");
            int daysCommute = scan.nextInt();
            premiumCost += daysCommute*5;
        }

        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age<=16){
            System.out.println("You can't be driving");
            System.exit(0);
        } else if (age>16 && age<20) {
            premiumCost *= 10;
        } else if (age>=20 && age<25) {
            premiumCost *=6;
        } else if (age>=25) {
            premiumCost *= 2;
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        String haveAnyAccident = scan.next();
        if (haveAnyAccident.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            int numOfAccident = scan.nextInt();
            premiumCost += numOfAccident*10;
        }
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        String educationLevel = scan.nextLine();
        if (educationLevel.equalsIgnoreCase("Bachelors") || educationLevel.equalsIgnoreCase("Masters")){
            premiumCost = premiumCost - (premiumCost*5/100);
        } else if (educationLevel.equalsIgnoreCase("PHD")) {
            premiumCost = premiumCost - (premiumCost*10/100);
        } else if (educationLevel.equalsIgnoreCase("High School")) {
            premiumCost = premiumCost - (premiumCost*5/100);
        }

        String firstCharOfFirstName = fullName.substring(0,1).toUpperCase();
        String remainOfFirstName = fullName.substring(1, fullName.indexOf(" ")).toLowerCase();

        String firstCharOfLastName = fullName.substring(fullName.indexOf(" ")+1,fullName.indexOf(" ")+2).toUpperCase();
        String remainOfLastName = fullName.substring(fullName.indexOf(" ")+2).toLowerCase();


        //reference number
        String firstToCharOfFirstName = fullName.substring(0,2);
        String lastThreeCharOfLastName = fullName.substring(fullName.length()-3);
        String referenceNumber = firstToCharOfFirstName + age + lastThreeCharOfLastName + zipCode + educationLevel.replace(" ", "");



        String properFullName = firstCharOfFirstName+remainOfFirstName+" "+firstCharOfLastName+remainOfLastName;
        System.out.println(properFullName+", here's your quote!\nThis is your start premium cost: $"+premiumCost+
                "\nThis is your reference number: "+ referenceNumber.toUpperCase()  );

        scan.close();
    }
}
