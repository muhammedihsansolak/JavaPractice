package day24_Practice;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60};
        int[] result = removeElement(arr,0);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeElement(int[] arr, int givenIndex) {
        int[] result = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != givenIndex) {
                result[j++] = arr[i];
                if (j == result.length) {
                    break;
                }
            }
        }
        return result;
    }
}
/*
10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */

