package coreJavaPractice.day14_Practice;

import java.util.Scanner;

public class CalledEmailTask1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Your E-Mail:");
        String eMail = scan.next();

        if (eMail.indexOf('_') >= 0) {
            String firstPart = eMail.substring(0, eMail.indexOf("_"));
            String secondPart = eMail.substring(eMail.indexOf("_") + 1, eMail.indexOf('@'));

            System.out.println(secondPart+"_"+firstPart+eMail.substring(eMail.indexOf('@')));
        }else{
            System.out.println(eMail);
        }

        scan.close();
    }
}
/*
Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */