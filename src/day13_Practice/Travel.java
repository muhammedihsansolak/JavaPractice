package day13_Practice;

import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you have a valid passport? (yes/no)");
        String validPassport = scan.next();

        if (validPassport.equals("yes")){

            int ticket = 1000;

            scan.nextLine();

            System.out.println("Which country do you want to travel");
            String countryName = scan.nextLine();

            System.out.println("How many bags do you have while travelling? (Each bag will add 50 to the cost)");
            byte bags = scan.nextByte();

            System.out.println("How many people will you travel with? (For each person the cost is reduced by 100. Up to a limit of 300.)" );
            short travelFriend = scan.nextShort();

            if (travelFriend > 3 ){
                travelFriend = 3;
            }

            scan.nextLine();

            System.out.println("Enter the name of the people you will travel with: (separating each name with a comma)");
            String travelFriendNames = scan.nextLine();

            int costAmount = ticket + (bags*50) - (travelFriend*100);

            System.out.println("Your ticket is booked to "+ countryName+".\nWe have charged extra for the "+bags+"  bags but you are traveling with "+
                    travelFriendNames+" so we are giving a discount.\nYour total cost is $"+costAmount);

        } else if (validPassport.equals("no")) {

            int passportRenewal = 200;

            System.out.println("When is your passport expired? (Each year it was expired adds 75 to the cost)");
            int passportExpiredYear = scan.nextInt();
            int passportExpiredCost = (2023-passportExpiredYear)*75;

            scan.nextLine();

            System.out.println("Which country do you want to travel?");
            String countryName = scan.nextLine();

            System.out.println("Do you want to travel next year or not? (yes/no)");
            String wannaTravelNextYear = scan.next();

            int wannaTravelNextYearCost = 50;
            if (wannaTravelNextYear.equals("yes")){
                wannaTravelNextYearCost = 100;
            } else if (wannaTravelNextYear.equals("no")) {
                wannaTravelNextYearCost = -50;
            }
            int totalCost = passportRenewal+passportExpiredCost+wannaTravelNextYearCost;
            System.out.println("Looks like your password has been expired from "+passportExpiredYear+", but not to worry\n" +
                    "we will get it ready for you to travel to "+countryName+". Your total cost has come out to $"+totalCost);

        }


        scan.close();
    }
}
/*
Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."

 */