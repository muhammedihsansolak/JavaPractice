package coreJavaPractice.day18_Practice;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int price = 0;
        System.out.println("Do you want to reserve a room?");
        String answer = scan.next().toLowerCase();
        while ( !(answer.equals("yes") || answer.equals("no")) ){
            System.err.println("Invalid reply. Please enter either YES or NO: ");
            answer = scan.next().toLowerCase();
        }

        if (answer.equals("no")){
            System.out.println("Have a nice day!!");
            System.exit(0);
        }

        scan.nextLine();
        System.out.println("which type of room the you want to reserve?\nOptions ==> King Bed, Queen Bed, Single Bed");
        String roomType = scan.nextLine().toLowerCase();

        while ( ! ( roomType.equals("king bed") || roomType.equals("queen bed") || roomType.equals("single bed") )   ){
            System.err.println("Invalid entry. Please type one of them ==> King Bed, Queen Bed, Single Bed");
            roomType = scan.nextLine().toLowerCase();
        }
        switch (roomType){
            case "king bed":
                price = 120;
                break;
            case "queen bed":
                price = 100;
                break;
            case "single bed":
                price = 80;
                break;
        }
        System.out.println("Thanks for choosing us!\nYou have selected "+roomType.toUpperCase()+" room. Total amount is $"+price);



        scan.close();
    }
}
/*
Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */