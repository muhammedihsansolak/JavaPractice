package day21_Practice;

import java.util.Arrays;

public class RotatedLeft {

    public static void main(String[] args) {

        int[] y = {17, 12, 10, 8};
        int temp = y[0];
        for (int i = 1; i < y.length; i++) {
            y[i -1 ] = y[i];
        }
        y[y.length-1]=temp;
        System.out.println(Arrays.toString(y));
    }
}
/*
 Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left"

        int[] x = {1,2,3};           // = > [2,3,1]
        int[] y = {17,12,10,8};      // = > [12,10,8,17]
        int[] a = {7,0,0};           // = > [0,0,7]

        SOLUTİON ==>
1.backup first element,

2.replace the rest (using loop)

3.place the first element at the end.
 */
