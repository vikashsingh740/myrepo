package org.general.dp.knapsack;

public class FindMaxVal {

    public static int knapsack(int[] weight, int[] values, int w, int n) {
        if(n== 0 || w == 0){
           return 0;
        }
        // if the box weight is more than item weight we can choose or ignore
        if(w >= weight[n-1]){
            return Math.max(values[n-1]+ knapsack(weight, values, w-weight[n-1],n-1),
                    knapsack(weight, values, w,n-1));
         } else {
            return knapsack(weight, values, w,n-1);
        }
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int W = 5;  // max capacity
        int val = knapsack(weights, values, W, values.length);
        System.out.println("Max value: "+val);
    }
}
