package leetCodePractice;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return nums[0] == 0 ? nums.length : nums.length+1;
    }

    //binary search
    public static int missingNumber2(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length;
        int mid;
        while (left<right){
            mid = (left+right) / 2;
            if (nums[mid] > mid) right = mid;
            else left = mid+1;
        }
        return left;
    }

}
/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.
 */