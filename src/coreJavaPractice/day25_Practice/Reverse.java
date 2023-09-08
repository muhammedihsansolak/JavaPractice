package coreJavaPractice.day25_Practice;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int[] result = reverse(arr);
        System.out.println(Arrays.toString(result));

        System.out.println("___________________________");

        String[] arr2 = {"Muhammed","Solak"};
        String[] arr3 = reverse(arr2);
        System.out.println(Arrays.toString(arr3));

    }
    public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];


        for (int i = arr.length -1, j=0 ; i >= 0 ; i--) {
            result [j] = arr[i];
            j++;
        }
        return result;
    }

    public static double[] reverse(double[] arr){
        double[] result = new double[arr.length];


        for (int i = arr.length -1, j=0 ; i >= 0 ; i--) {
            result [j] = arr[i];
            j++;
        }
        return result;
    }

    public static char[] reverse(char[] arr){
        char[] result = new char[arr.length];


        for (int i = arr.length -1, j=0 ; i >= 0 ; i--) {
            result [j] = arr[i];
            j++;
        }
        return result;
    }

    public static String[] reverse(String[] arr){
        String[] result = new String[arr.length];


        for (int i = arr.length -1, j=0 ; i >= 0 ; i--) {
            result [j] = arr[i];
            j++;
        }
        return result;
    }
    
    
}
