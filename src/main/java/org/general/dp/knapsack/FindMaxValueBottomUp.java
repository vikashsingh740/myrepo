package org.general.dp.knapsack;

public class FindMaxValueBottomUp {

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int w = 5;  // max capacity
        int val = solve(weights, values, w, values.length);
        System.out.println("Max value: "+val);
    }

    public static int solve(int[] weight, int[] values, int w, int n) {
        int[][] t = new int[n + 1][w + 1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < w+1; j++) {
                if (j >= weight[i - 1]) {
                    t[i][j] = Math.max(
                            values[i - 1] + t[i - 1][j - weight[i - 1]],
                            t[i - 1][j]
                    );
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }
}
