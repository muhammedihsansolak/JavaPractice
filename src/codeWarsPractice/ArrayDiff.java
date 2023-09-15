package codeWarsPractice;
import java.util.*;


public class ArrayDiff {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2,2,2, 3}, new int[]{1,2,3})));

    }

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> list = new ArrayList<>();
        for (int i : b) {
            list.add(i);
        }

        List<Integer> result = new ArrayList<>();
        for (Integer each : a) {
            if ( ! list.contains(each)) result.add(each);
        }

        int[] arr = new int[result.size()];
        int i = 0;
        for (Integer each : result) {
            arr[i++] = each;
        }
        return arr;
    }


}
/*
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed from the other:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */