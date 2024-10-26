package org.example.general;

public class BestTimeToBuyAndSellProduct {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int costPrice = a[0];
        int maxProfit = 0;
        int profit = 0;
        for (int i = 1; i < a.length; i++) {
             if(a[i]<costPrice){
                 costPrice = a[i];
             }else {
                 profit = a[i]-costPrice;
                 maxProfit = Math.max(maxProfit,profit);
             }
        }
        System.out.println(maxProfit);
    }

}
