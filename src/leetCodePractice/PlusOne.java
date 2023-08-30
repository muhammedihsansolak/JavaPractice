package leetCodePractice;


import java.util.Arrays;


public class PlusOne {

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};

        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        //iterate the loop from last
        for (int i = digits.length -1; i >= 0; i--) {
            //last digit is less than 9, add 1 to it and return the array
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }else // if last digit is 9, set last digit to 0 and go next iteration until one of the digit is less than 9
                digits[i] = 0;
        }
        //if all remaining elements are not smaller than 9 it means we have 9999999..... We need a array which is 1 element larger than previous one. first element must be 1
        int[] arr = new int[digits.length +1];
        arr[0] = 1;
        return arr;
    }



}
/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
 */