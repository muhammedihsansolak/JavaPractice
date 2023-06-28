package day24_Practice;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] result = reverseArray(arr);
        System.out.println(Arrays.toString(result));//[5, 4, 3, 2, 1]
    }

    public static int[] reverseArray(int[] arr) {

        int[] result = new int[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            result[j] = arr[i];
        }
        return result;
    }
}
/*
8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
 */