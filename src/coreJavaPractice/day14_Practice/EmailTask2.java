package coreJavaPractice.day14_Practice;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your E-Mail:");
        String eMail = scan.next();

        String firstName = eMail.substring(0,eMail.indexOf('_'));
        String lastName = eMail.substring(eMail.indexOf('_')+1,eMail.indexOf('@'));
        String domain = eMail.substring(eMail.indexOf('@')+1,eMail.indexOf('.'));
        System.out.println("First Name: "+firstName+"\nLast Name: "+lastName + "\nDomain: "+domain);

        scan.close();
    }
}
/*
Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */