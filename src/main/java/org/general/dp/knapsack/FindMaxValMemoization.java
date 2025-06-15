package org.general.dp.knapsack;


public class FindMaxValMemoization {
    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int w = 5;  // max capacity
        int n = weights.length;
        int[][] t = new int[n+1][w+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){
               t[i][j] = -1;
            }
        }
        int val = knapsack(weights, values, w, values.length, t);
        System.out.println("Max value: "+val);
    }

    private static int knapsack(int[] weights, int[] values, int w, int n, int[][] t) {
        if(n==0 || w==0){
            return 0;
        }
        if(t[n][w] != -1){
            return t[n][w];
        }
        if(w>= weights[n-1]){
            return t[n][w] = Math.max(values[n-1]+knapsack(weights, values, w-weights[n-1], n-1, t),
                    knapsack(weights, values, w, n-1, t));
        }else{
            return t[n][w] = knapsack(weights, values, w, n-1, t);
        }
    }
}
