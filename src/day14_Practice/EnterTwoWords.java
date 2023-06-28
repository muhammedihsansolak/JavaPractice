package day14_Practice;

import java.util.Scanner;

public class EnterTwoWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter two words:");
        String word1 = scan.next();
        String word2 = scan.next();

        word1 = word1.substring(1);
        word2 = word2.substring(1);
        System.out.println(word1+word2);

        scan.close();
    }
}
/*
Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */