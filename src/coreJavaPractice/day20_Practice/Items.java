package coreJavaPractice.day20_Practice;

public class Items {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        //Print the report of each shopping item
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " -  $" + prices[i] + " -  #" + itemIDs[i]);
        }
        System.out.println();
        //find out if "iPad" is contained in the item list

        String dummy = "";
        for (int i = 0; i < items.length; i++) {
            dummy += items[i];
        }
        if (dummy.toLowerCase().contains("ipad")){
            System.out.println("iPad is in your item list.");
        }
        System.out.println();
        //find out the first index number of "Gloves"

        for (int i = 0; i < items.length; i++) {

            if (items[i].equals("Gloves")){
                int indexOfGloves = i;
                System.out.println("Index of gloves: "+indexOfGloves);
            }
        }

    }
}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */