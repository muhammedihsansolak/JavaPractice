package leetCodePractice;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }


    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int each : nums) {
            if (frequency.containsKey(each)){
                frequency.put(each, frequency.get(each)+1);
            } else {
                frequency.put(each,1);
            }
        }

        Queue<Integer> maxHeap = new PriorityQueue<>
                ((a,b) -> frequency.get(b).compareTo(frequency.get(a)));

        maxHeap.addAll(frequency.keySet());
        System.out.println(maxHeap);

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = maxHeap.remove();
        }
        return arr;
    }

}
/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 */