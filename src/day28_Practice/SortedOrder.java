package day28_Practice;

import java.util.Arrays;

public class SortedOrder {

    public static void main(String[] args) {

        String str = "abzy";

        boolean result = isSorted(str);
        System.out.println(result);

    }

    public static boolean isSorted(String str) {
        String arr[] = str.split("");
        String[] arrCopy = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        return Arrays.equals(arr,arrCopy);

    }
}
/*
Homework  : Sorted Order

                Create a method that accepts a String and returns a boolean.
                return true if the given String is sorted meaning the characters are in alphabetically order
                return false if the given String is not sorted

        Ex:
           input: "abcd"
           output: true

           input: "abzy"
           output: false
 */