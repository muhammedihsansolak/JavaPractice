package cydeoAlgorithmTasks;

import java.util.Arrays;

public class FindMaxFromIntArray {
    public static void main(String[] args) {
        int[] arr = {6, 8, 3, 5, 1, 9};
        System.out.println(max(arr));
    }

    public static int max(int[] arr){
        return Arrays.stream(arr).max().orElseThrow(() -> new RuntimeException("No max value exist"));
    }
}
/*
Write a function that can find the maximum number from an int Array.
input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9

 */