package day13_Practice;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first sentence:");
        String firstSentence = scan.nextLine();

        System.out.println("Please enter your second sentence:");
        String secondSentence = scan.nextLine();

        if (firstSentence.length()>secondSentence.length()){
            System.out.println(firstSentence);
        } else if (secondSentence.length()>firstSentence.length()) {
            System.out.println(secondSentence);
        }
        scan.close();
    }

}
/*
write a program that asks user to enter two strings, and print out the longest string
 */