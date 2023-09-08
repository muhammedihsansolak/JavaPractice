package coreJavaPractice.day24_Practice;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int[] result = addElement(arr , 4);
        System.out.println(Arrays.toString(result));//[1, 2, 3, 4]
    }

    public static int[] addElement(int[] arr, int element) {
        int i = 0;
        int[] dummy = new int[arr.length + 1];
        for (int each : arr) {
            dummy[i++] = each;
        }
        dummy[i] = element;
        return dummy;

    }
}
/*
6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
 */