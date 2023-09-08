package leetCodePractice;

import java.util.*;

public class BestTimeToBuyAndSellStock {


    /**
     * Brute force ---> I iterated my input with nested loops. I declared a maxProfit variable to keep track of the profits. j value must be start from i+1 since it can not be previous days
     */

    public int maxProfit(int[] prices) {
       int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j] > prices[i]){
                    int profit = prices[j] - prices[i];
                    if (profit > maxProfit) maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    /**
     * I declared two variables. Minbuy is constantly changing based on Math.min method. this method is iterating the input array and compares the elements. At the same time I checked profit values since I need max one
     */

    public int maxProfit2(int[] prices) {

        int minBuy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            minBuy = Math.min(minBuy,prices[i]);
            profit = Math.max(profit, prices[i] - minBuy );
        }
        return profit;
    }

    /**
     * There is two different point of view. first point is to find smaller value. second point is to find max profit. They can be independent as we declared two different variables for them
     */

    public int maxProfit3(int[] prices) {
        int lsf = Integer.MAX_VALUE; // least so far
        int op = 0; // overall profit
        int pist = 0; // profit if sold today

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){ // if we found new buy value which is more smaller then previous one
                lsf = prices[i]; // update our least so far
            }
            pist = prices[i] - lsf; // calculating profit if sold today by, Buy - sell
            if(op < pist){ // if pist is more then our previous overall profit
                op = pist; // update overall profit
            }
        }
        return op; // return op
    }

    public int maxProfit4(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }


}
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */