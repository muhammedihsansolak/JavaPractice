package coreJavaPractice.day17_Practice;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 11;

        int division = 0;

        while (num1 >= num2){
            num1 -= num2;
            division++;
        }
        System.out.println(division+ " with a remainder of "+ num1);


    }
}
/*
Write a program that can divide two positive numbers without using / (division)
 and * (multiplication) operators.
 */