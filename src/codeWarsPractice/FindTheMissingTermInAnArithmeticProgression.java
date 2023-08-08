package codeWarsPractice;

import java.util.Arrays;
import java.util.Collections;

public class FindTheMissingTermInAnArithmeticProgression {
//TODO
    public static void main(String[] args) {
        int[] arr = {11, 9, 5, 3, 1};

        System.out.println(findMissing(arr));
    }

    public static int findMissing(int[] numbers) {
        int progression = ( numbers[0] + numbers[numbers.length-1] ) / (numbers.length+1);
        int[] original = new int[numbers.length+1];
        original[0] = numbers[0];
        if (numbers[0] <= numbers[numbers.length-1]){
            for (int i = 1; i < original.length; i++) {
                original[i] = original[i-1]+progression;
            }
        }else {
            for (int i = 1; i < original.length; i++) {
                original[i] = original[i-1]-progression;
            }
        }
        return original[Arrays.mismatch(original,numbers)];
    }

}
/*
An Arithmetic Progression is defined as one in which there is a constant difference between the consecutive terms of a given series of numbers. You are provided with consecutive elements of an Arithmetic Progression. There is however one hitch: exactly one term from the original series is missing from the set of numbers which have been given to you. The rest of the given series is the same as the original AP. Find the missing term.

You have to write a function that receives a list, list size will always be at least 3 numbers. The missing term will never be the first or last one.

Example
findMissing([1, 3, 5, 9, 11]) == 7
PS: This is a sample question of the facebook engineer challenge on interviewstreet. I found it quite fun to solve on paper using math, derive the algo that way. Have fun!
 */