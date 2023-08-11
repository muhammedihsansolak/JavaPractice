package leetCodePractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate2(arr));

    }
    //33 ms
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (map.containsKey(num)){
                count = map.get(num);
                map.put(num , count+1);
            }else {
                map.put(num,1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1 ) return true;
        }
        return false;
    }

    //26 ms
    public static boolean containsDuplicate2(int[] nums) {
       int[] distinct = Arrays.stream(nums).distinct().toArray();
       return nums.length != distinct.length;
    }


}
/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
 */