package day21_Practice;

import java.util.Arrays;

public class SortingArrayInDescendingOrder {

    public static void main(String[] args) {

        int numbers [] = {1,5,4,3,2};
        Arrays.sort(numbers);
        int result [] = new int[numbers.length];

        int i = numbers.length -1 ;
        for (int each : numbers) {
            result[i] = each;
            i--;
        }
        System.out.println(Arrays.toString(result));
    }
}
//1. Write a program that sort the array of integer in descending order