package coreJavaPractice.day24_Practice;

import java.util.Arrays;

public class ReversedArrMethod {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = reversedArr(arr);
        System.out.println(Arrays.toString(result));


    }
    public static int[] reversedArr(int[] arr){

        int[] temp = new int[arr.length];
        for (int i = 0,j=arr.length - 1   ; j >= 0   ; j--, i++  ){

            temp[i] = arr[j];
        }
        return temp;
    }


}
//create a method that return the reversed array