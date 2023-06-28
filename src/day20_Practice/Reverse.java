package day20_Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        int [] reversedArray = new int[array.length];
        int num = 0;
        for (int i = array.length-1; i >= 0 ; i--) {

                reversedArray[num++] = array[i];

        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */