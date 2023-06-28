package day15_Practice;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result = "";

        for (int i = 0; i <= word.length() -1 ; i++) {

            String ch = ""+word.charAt(i);

            if (!result.contains(ch)){
                result += ch;
            }
        }
        System.out.println(result);




        scan.close();
    }
}
