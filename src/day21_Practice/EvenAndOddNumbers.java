package day21_Practice;

import java.util.Arrays;

public class EvenAndOddNumbers {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11};
        int even = 0,
                odd = 0;

        for( int each : numbers ){
            if (each % 2 == 0){
                even++;
            } else{
                odd++;
            }
        }
        System.out.println(Arrays.toString(numbers) + " ==> in this array, even numbers have "+even+" time occured," +
                "odd numbers have "+ odd +" time occured.");
    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */