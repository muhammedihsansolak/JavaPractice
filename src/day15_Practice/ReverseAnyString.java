package day15_Practice;

import java.util.Scanner;

public class ReverseAnyString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.next();
        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            reversed += str.charAt(i);

        }
        System.out.println("Reversed string: "+reversed);

        scan.close();
    }
}
/*
Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123
 */