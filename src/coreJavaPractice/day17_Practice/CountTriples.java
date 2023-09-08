package coreJavaPractice.day17_Practice;

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW
        int countTripleCount = 0;
        for (int i = 0; i <= str.length()-3; i++) {//aaabbbhh
                                                //   01234567
            String triple = str.substring(i, i + 3);

            char ch1 = triple.charAt(0);
            char ch2 = triple.charAt(1);
            char ch3 = triple.charAt(2);
            if (ch1 == ch2 && ch1 == ch3) {
                countTripleCount++;
            }

        }
        System.out.println(countTripleCount);

    }
}
