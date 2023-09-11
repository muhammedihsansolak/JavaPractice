package codeWarsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindOdd {

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{0, 1, 0, 1, 0}));
    }

    public static int findIt(int[] a) {
        ArrayList<Integer> ints = new ArrayList<>();
        for (int each : a) {
            ints.add(each);
        }

        for (int i = 0; i < ints.size(); i++) {
            int frequency = Collections.frequency(ints, ints.get(i));
            if (frequency % 2 != 0) return ints.get(i);
        }
        return -1;
    }

}
/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */