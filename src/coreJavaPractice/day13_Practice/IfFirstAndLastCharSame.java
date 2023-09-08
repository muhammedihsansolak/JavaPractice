package coreJavaPractice.day13_Practice;

import java.util.Scanner;

public class IfFirstAndLastCharSame {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();

        if (word.charAt(0) == word.charAt(word.length()-1)){
            System.out.println("First and last characters are same!!");
        } else {
            System.out.println("First and last characters are not same :(");
        }


        scan.close();
    }
}
