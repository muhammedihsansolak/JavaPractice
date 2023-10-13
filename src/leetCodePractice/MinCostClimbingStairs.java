package leetCodePractice;

import java.util.Arrays;

public class MinCostClimbingStairs {

    public static void main(String[] args) {
        int[] arr = {10,15,20,5,50,30};
        System.out.println(minCostClimbingStairs(arr));
    }

    //Time:O(n) Space:O(n)
        //[10,15,20]0
    public static int minCostClimbingStairs(int[] cost) {
        int[] arr = new int[cost.length + 1];
        System.arraycopy(cost, 0, arr, 0, cost.length);
        for (int i = arr.length - 3; i >= 0; i--) {
            arr[i] += Math.min(arr[i+1], arr[i+2]);
        }
        return Math.min(arr[0], arr[1]);
    }

    //Time:O(n) Space:O(1)
    public int minCostClimbingStairs2(int[] cost) {
        int n = cost.length ;
        for(int i=2 ; i<n ; i++){
            cost[i] = Math.min(cost[i-1] , cost[i-2]) + cost[i];
        }
        return Math.min(cost[n-1] , cost[n-2]);
    }

}
/*

You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.



Example 1:

Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.
Example 2:

Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.


Constraints:

2 <= cost.length <= 1000
0 <= cost[i] <= 999
 */