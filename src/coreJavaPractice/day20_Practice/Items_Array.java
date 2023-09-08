package coreJavaPractice.day20_Practice;

import java.util.Scanner;

public class Items_Array {

    public static void main(String[] args) {

        String[] items = new String[5];
        int prices[] = new int[5];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter item name:");
            items[i] = scan.nextLine();
            System.out.println("Enter price: ");
            prices[i] = scan.nextInt();
            scan.nextLine();
        }
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]+ " --  $" + prices[i] );
        }
        System.out.println("Total price ==> "+ sum + " <==");


    }
}
/*
5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
 */