package day13_Practice;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word which has 5 character:");

        String word = scan.next();

        if (word.length() == 5){
            char firstChar = word.charAt(0);
            char secondChar = word.charAt(1);
            char thirdChar = word.charAt(2);
            char fourthChar = word.charAt(3);
            char fifthChar = word.charAt(4);
            System.out.println(fifthChar+""+fourthChar+thirdChar+secondChar+firstChar);
        } else if (word.length()<5) {
            System.err.println("Too short!");
        }else if (word.length()>5){
            System.err.println("Too long!");
        }
        scan.close();
    }
}
/*
Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */