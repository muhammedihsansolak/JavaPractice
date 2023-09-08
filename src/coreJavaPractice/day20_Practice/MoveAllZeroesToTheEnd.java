package coreJavaPractice.day20_Practice;

import java.util.Arrays;

public class MoveAllZeroesToTheEnd {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        int[] result = new int[array.length];

        for (int i = 0, a = 0; i < array.length; i++) {

            if (array[i] != 0) {
                result[a++] = array[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */