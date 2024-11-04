package br.com.leetcode.array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
public class BestTimeBuySellStockCopilot {
    public static void main(String[] args) {
        int[] prices = {6,1,3,2,4,7};
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
}

