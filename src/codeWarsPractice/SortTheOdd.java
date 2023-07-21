package codeWarsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheOdd {

    public static int[] sortArray(int[] array) {
        List<Integer> odd = new ArrayList<>();
        for (int each : array) {
            if (each % 2 != 0) {
                odd.add(each);
            }
        }
        Collections.sort(odd);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = odd.get(index);
                index++;
            }
        }
        return array;
    }
}
/*
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

Examples
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
 */