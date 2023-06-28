package day24_Practice;

import java.util.Arrays;

public class MergeTwoArrMethod {

    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = {5,5,6,6,7,7,8};
        int[] result = mergeTwoArr(arr1 , arr2);
        System.out.println(Arrays.toString(result));


    }
    public static int[] mergeTwoArr(int[] arr1, int[] arr2){
        int[] dummy = new int[arr1.length + arr2.length];
        int index = 0;
        for (int each : arr1) {
            dummy[index] = each;
            index++;
        }
        for (int each : arr2) {
            dummy[index] = each;
            index++;
        }
        return dummy;
    }

    
}
//create a method that can merge two arrays and return the new array