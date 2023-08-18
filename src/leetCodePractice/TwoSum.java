package leetCodePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,9,11};
        System.out.println(Arrays.toString(twoSum2(arr, 9)));
        System.out.println(Arrays.toString(twoSum4(arr, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i<nums.length ; i++){
            for(int j = 1; j<nums.length ; j++){
                if(i==j) continue;
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int match = target - nums[i];
            if (map.containsKey(match)) return new int[]{ map.get(match) , i};
            else map.put( nums[i] , i );
        }
        return new int[]{};
    }

    public static int[] twoSum3(int[] arr , int target){
        //  element     index
        Map<Integer , Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put( arr[i], i );
        }
        for (int i = 0; i < arr.length; i++) {
            int match = target - arr[i] ;
            if (map.containsKey(match)) return new int[]{ i , map.get(match)};
        }
        return new int[]{};
    }

    public static int[] twoSum4 (int[] arr, int target){

        int left = 0;
        int right = arr.length-1;
        //create a map to store elements and indices
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            //      element index
            map.put( arr[i] , i);
        }

        while (left < right){

            if (arr[left] + arr[right] == target){ //if it is match with target
                return new int[]{ map.get( arr[left] ) ,map.get( arr[right] ) }; //return indices from map
            } else if (arr[left] + arr[right] < target) {//if it is small, go right or vice versa
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

}
