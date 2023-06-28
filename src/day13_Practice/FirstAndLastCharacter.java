package day13_Practice;

import java.util.Scanner;

public class FirstAndLastCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String sentence = scan.nextLine();

        char firstCharacter = sentence.charAt(0);
        char lastCharacter = sentence.charAt(sentence.length()-1);
        System.out.println(firstCharacter+""+lastCharacter);

        scan.close();
    }
}
/*

 */