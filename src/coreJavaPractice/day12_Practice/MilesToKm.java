package coreJavaPractice.day12_Practice;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter miles:");
        double miles = scan.nextDouble();
        double km = miles * 1.61;

        System.out.println(miles+" miles equals to "+km+" kilometers.");

        scan.close();
    }
}
/*
Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */