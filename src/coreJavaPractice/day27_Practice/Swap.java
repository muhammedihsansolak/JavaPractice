package coreJavaPractice.day27_Practice;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = swap(arr, 2, 6);
        System.out.println(Arrays.toString(result));

    }

    public static int[] swap(int[] arr, int i, int j) {
        int[] res = new int[arr.length];
        for (int k = 0, z = 0; k < arr.length; k++, z++) {
            if (k == i) {
                res[k] = arr[j];
            } else if (k == j) {
                res[k] = arr[i];
            } else {
                res[k] = arr[z];
            }
        }
        return res;
    }
    public static double[] swap(double[] arr, int i, int j) {
        double[] res = new double[arr.length];
        for (int k = 0, z = 0; k < arr.length; k++, z++) {
            if (k == i) {
                res[k] = arr[j];
            } else if (k == j) {
                res[k] = arr[i];
            } else {
                res[k] = arr[z];
            }
        }
        return res;
    }
    public static char[] swap(char[] arr, int i, int j) {
        char[] res = new char[arr.length];
        for (int k = 0, z = 0; k < arr.length; k++, z++) {
            if (k == i) {
                res[k] = arr[j];
            } else if (k == j) {
                res[k] = arr[i];
            } else {
                res[k] = arr[z];
            }
        }
        return res;
    }
    public static String[] swap(String[] arr, int i, int j) {
        String[] res = new String[arr.length];
        for (int k = 0, z = 0; k < arr.length; k++, z++) {
            if (k == i) {
                res[k] = arr[j];
            } else if (k == j) {
                res[k] = arr[i];
            } else {
                res[k] = arr[z];
            }
        }
        return res;
    }
}
/*
2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array
 */