package cydeoAlgorithmTasks;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class FindElementsGreaterThanTheirRights {

    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 3, 1};
        System.out.println(find(arr));
    }

    public static List<Integer> find(int[] arr){
        Deque<Integer> stack = new LinkedList<>();

        stack.push(arr[arr.length-1]);//I pushed last element since there is no element after that

        for (int i = arr.length - 1; i >= 0; i--) { //I traversed input array from last
            int current = arr[i];

            if (stack.peek()<current){// If my current value is greater than top of the stack I pushed the current
                stack.push(current);
            }
        }
        return new ArrayList<>(stack);
    }


}
/*
Given an unsorted integer array, return all greater elements than all elements present to their right using
Stack.
Example:
Input: [10, 4, 6, 3, 5]
Output: [10, 6, 5]
The elements that are greater than all elements to their right are 10, 6, and 5.
10 > 4 & 10 > 6 & 10 > 3 & 10 > 5

 */