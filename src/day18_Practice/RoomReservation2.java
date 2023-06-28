package day18_Practice;

import java.util.Scanner;

public class RoomReservation2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int price = 0;
        while (true) {

            System.out.println("Which bedroom do you want to reserve?\nKing Bed ==> 120$\nQueen Bed ==> 100$\nSingle Bed ==> 80$");
            String roomType = scan.nextLine().toLowerCase();
            while (!(roomType.equals("king bed") || roomType.equals("queen bed") || roomType.equals("single bed"))) {
                System.err.println("Invalid entry. Please choose one of them:\nKing Bed ==> 120$\nQueen Bed ==> 100$\nSingle Bed ==> 80$ ");
                roomType = scan.nextLine().toLowerCase();
            }

            System.out.println("How many nights do you want to stay?");
            int nights = scan.nextInt();

            switch (roomType) {
                case "king bed":
                    price += 120*nights;
                    break;
                case "queen bed":
                    price += 100*nights;
                    break;
                case "single bed":
                    price += 80*nights;
                    break;
            }

            System.out.println("Would you like to reserve another room?");
            String anotherRoom = scan.next().toLowerCase();
            while (!(anotherRoom.equals("yes") || anotherRoom.equals("no"))) {
                System.err.println("Invalid entry. Please enter YES or NO:");
                anotherRoom = scan.next().toLowerCase();
            }
            if (anotherRoom.equals("no")) {
                System.out.println("Your total is: $" + price);
                break;
            }
            scan.nextLine();
        }

        scan.close();


    }
}
/*
Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */