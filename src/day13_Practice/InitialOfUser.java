package day13_Practice;

import java.util.Scanner;

public class InitialOfUser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first user:");
        String firstUser = scan.next();

        System.out.println("Enter your second user:");
        String secondUser = scan.next();

        char firstChar = firstUser.charAt(0);
        char secondChar = secondUser.charAt(0);

        System.out.println(firstChar+"."+secondChar);

        scan.close();

    }

}
/*
write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */