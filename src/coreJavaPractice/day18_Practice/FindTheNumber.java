package coreJavaPractice.day18_Practice;

import java.util.Random;
import java.util.Scanner;

public class FindTheNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int hiddenNumber = random.nextInt(10);
        System.out.println("Try to find the number:");
        int attempt = scan.nextInt();
        while(true) {
            if (attempt > hiddenNumber) {
                System.out.println("Try with less number:");
                attempt = scan.nextInt();
            } else if (hiddenNumber>attempt) {
                System.out.println("Try with bigger number:");
                attempt = scan.nextInt();
            }else {
                System.out.println("CONGRATULATİON!");
                break;
            }
        }



        scan.close();
    }
}
/*
Create a random number
Random random =new Random();
int hiddenNumber=random.nextInt(100);
2- User try to find the number by using keyboard
3- If the users number bigger than hidden number print a message that "Try with less number" and give one more attempt
4- If the users number less than hidden number print a message that "Try with bigger number" and give one more attempt
5- If the user finds the number print "Congratulations" and exit the loop
 */