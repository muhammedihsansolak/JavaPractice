package coreJavaPractice.day08_Practice;

public class SumOfAllDigits {
/*
Create a program that will define an int number that ranges from 100 - 999. Take each digit individually and calculate the sum of all the digits

    Ex:
        input: 561
        output: 12
            -> 5 + 6 + 1 = 12

    Extra: Output the result in this format:
        The sum of the digits in $number is $sum
        ex: The sum of the digits in 561 is 12
 */
    public static void main(String[] args) {

        int number = 561;
        int firstDigit = number % 10;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number / 100;
        int sumOfDigits = firstDigit + secondDigit + thirdDigit;
        System.out.println("The sum of the digits in " + number + " is " + "\"" + sumOfDigits + "\"");

    }
}
