package coreJavaPractice.day18_Practice;

public class FibonacciSequence {

    public static void main(String[] args) {

        int a = 0, b = 1;
        System.out.print(a + ", " + b);
        for (int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    }

/*
Write a program that prints out the first 10 numbers in the Fibonacci sequence using a for loop.
 The Fibonacci sequence starts with 0, 1, and each subsequent number is the sum of the previous two.
  The first 10 numbers in the Fibonacci sequence are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.

Your program should output the numbers in a comma-separated list like this: "0, 1, 1, 2, 3, 5, 8, 13, 21, 34".
 */