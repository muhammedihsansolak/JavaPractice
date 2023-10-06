package leetCodePractice;

import java.util.*;

public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {5,6,5,6,6,5,5,6,5,6,5,5,5,6,6,6};
        System.out.println(majorityElement(nums));


    }

    public static int majorityElement(int[] nums) {
        int majority = nums[0]; //assume first element is majority element
        int count = 1;

        for (int i = 1; i < nums.length; i++) { //start iterating from second element since we assigned first to majority element
            if (count == 0) {//if count hit zero change majority element and set count to 1
                majority = nums[i];
                count = 1;
            } else if (nums[i] == majority) {
                count++;
            } else {//if there is another element reduce count
                count--;
            }
        }
        return majority;
    }

    public static int majorityElement2(int[] nums) {
        int majority = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0){
                majority = nums[i];
                count=1;
            }
            else if (nums[i] == majority) count++;
            else count--;
        }
        return majority;
    }
}




/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
