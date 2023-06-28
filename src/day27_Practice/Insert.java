package day27_Practice;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int[] res = insert(arr,3,100);
        System.out.println(Arrays.toString(res));

    }

    public static int[] insert(int[] arr, int index, int element){
        int[] result = new int[arr.length+1];
        int i = 0;
        for (int each : arr) {
            if (i != index){
                result[i] = each;
            } else {
                result[index] = element;
                result[++i] = each;
            }
            i++;
        }
        return result;
    }
    public static double[] insert(double[] arr, int index, double element){
        double[] result = new double[arr.length+1];
        int i = 0;
        for (double each : arr) {
            if (i != index){
                result[i] = each;
            } else {
                result[index] = element;
                result[++i] = each;
            }
            i++;
        }
        return result;
    }
    public static char[] insert(char[] arr, int index, char element){
        char[] result = new char[arr.length+1];
        int i = 0;
        for (char each : arr) {
            if (i != index){
                result[i] = each;
            } else {
                result[index] = element;
                result[++i] = each;
            }
            i++;
        }
        return result;
    }
    public static String[] insert(String[] arr, int index, String element){
        String[] result = new String[arr.length+1];
        int i = 0;
        for (String each : arr) {
            if (i != index){
                result[i] = each;
            } else {
                result[index] = element;
                result[++i] = each;
            }
            i++;
        }
        return result;
    }
}
/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array

 */