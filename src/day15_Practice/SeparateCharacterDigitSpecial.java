package day15_Practice;

import java.util.Scanner;

public class SeparateCharacterDigitSpecial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter something:");
        String str = scan.next();
        String letter = "";
        String digit = "";
        String chars = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (each >= '1' && each <= '9') {
                digit += each;
            } else if (each >= 'a' && each <= 'z') {
                letter += each;
            } else if (each >= 'A' && each <= 'Z') {
                letter += each;
            }else {
                chars += each;
            }
        }
        System.out.println("letters: "+ letter);
        System.out.println("digits: "+digit);
        System.out.println("special chars: "+ chars);

        scan.close();
    }
}
/*
write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */