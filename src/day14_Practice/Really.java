package day14_Practice;

import java.util.Scanner;

public class Really {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word:");

        String word = scan.next();

        word = word.substring(word.length()-2);

        if (word.equals("ly")){
            System.err.println("Really???");
        } else{
            System.out.println("Never mind :/");
        }



        scan.close();
    }
}
