package cydeoAlgorithmTasks;

import java.util.stream.IntStream;

public class FindFactorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int num){
        return IntStream.rangeClosed(1,num)
                .reduce( (a,b) -> a*b ).getAsInt();
    }

}
/*
Question-2 Find Factorial
Write a method that returns the factorial number of any given number.
Factorial: Factorial of a non-negative integer, is multiplication of all positive integers smaller
than or equal to n. For example, factorial of 6 is 6*5*4*3*2*1 which is 720.
 */