package coreJavaPractice.day17_Practice;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int item = 1;
        String shoppingList = "";
        int recieptTotalCost = 0;

        System.out.println("Enter the name of item :" + item);
        String a = scan.nextLine();
        System.out.println("Enter the price of the " + a);
        double price = scan.nextDouble();
        System.out.println("How many " + a + " will you buy?");
        int howMany = scan.nextInt();
        double totalCost = price * howMany;
        recieptTotalCost += totalCost;
        shoppingList += "\n" + a + " x " + howMany + " - " + totalCost;
        item++;

        System.out.println("Do you want to add more items to the shopping list?");
        String addAnswer = scan.next();

        while (addAnswer.equals("yes")) {
            scan.nextLine();
            System.out.println("Enter the name of item :" + item);
            a = scan.nextLine();
            System.out.println("Enter the price of the " + a);
            price = scan.nextDouble();
            System.out.println("How many " + a + " will you buy?");
            howMany = scan.nextInt();
            totalCost = price * howMany;
            recieptTotalCost += totalCost;
            shoppingList += "\n" + a + " x " + howMany + " - " + totalCost;
            item++;
            System.out.println("Do you want to add more items to the shopping list?");
            addAnswer = scan.next();
        }

        System.out.println(shoppingList+"\nTotal cost: "+recieptTotalCost);

        scan.close();
    }
}
