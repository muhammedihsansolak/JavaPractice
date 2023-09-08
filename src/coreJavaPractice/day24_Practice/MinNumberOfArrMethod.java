package coreJavaPractice.day24_Practice;

public class MinNumberOfArrMethod {

    public static void main(String[] args) {
        int[] arr = {9,8,7,7,8,9,8,76};
        int result = minNumberOffArr(arr);
        System.out.println(result);



    }
    public static int minNumberOffArr(int[] arr){
        int min = arr[0];
        for (int each : arr) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }



}
//create a method that can return the minimum number from an array of integers