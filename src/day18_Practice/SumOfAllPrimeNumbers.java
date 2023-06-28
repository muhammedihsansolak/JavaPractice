package day18_Practice;

public class SumOfAllPrimeNumbers {

    public static void main(String[] args) {

        int sum = 0; // Initialize a variable to hold the sum of prime numbers

// Loop through each number from 2 to 100
        for (int i = 2; i <= 100; i++) {

            // Initialize a boolean variable to true to indicate that i is prime
            boolean isPrime = true;

            // Check if i is divisible by any number from 2 to i-1
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    // If i is divisible by a number other than 1 and itself, it's not prime
                    isPrime = false;
                    break;
                }
            }

            // If i is prime, add it to the sum
            if (isPrime) {
                sum += i;
            }
        }

// Print the sum of prime numbers
        System.out.println(sum);


    }
}
/*
Write a Java program to find the sum of all the prime numbers between 1 and 100 (inclusive).

To solve this task, you can use a nested for loop to iterate through all the numbers between 1 and 100,
 and use an if statement to check if each number is prime or not. If a number is prime, you can add it to a
  running total. Finally, you can print out the sum of all the prime numbers at the end of the program.
 */