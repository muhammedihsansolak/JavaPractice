package coreJavaPractice.day24_Practice;

public class MaxNumberOfArrMethod {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,1,2,3,4,5,6,7};
        int result = maxNumOfArr(arr);
        System.out.println(result);


    }

    public static int maxNumOfArr(int[] arr){
        int max = arr[0];
        for (int each : arr) {
            if (each> max){
                max = each;
            }
        }
        return max;
    }


}
//create a method that can return the maximum number from an array of integers