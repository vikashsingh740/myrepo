package org.example.leetcode.array;

class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(buyPrice>prices[i]){
                buyPrice = prices[i];
            }else{
                profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit); 
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] a = {7,6,4,3,1}; //o/p 0
        // [7,1,5,3,6,4]  o/p 5s
    }
}