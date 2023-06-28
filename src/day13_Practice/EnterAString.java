package day13_Practice;

import java.util.Scanner;

public class EnterAString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scan.nextLine();

        if (str.length() == 0){
            System.err.println("String is empty");
        } else if (str.length()>3) {
            System.out.println((str.charAt(str.length()-3))+""+(str.charAt(str.length()-2)+""+(str.charAt(str.length()-1))));
        } else if (str.length()<=3) {
            System.out.println(str);
        }
        scan.close();
    }
}
/*
Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */