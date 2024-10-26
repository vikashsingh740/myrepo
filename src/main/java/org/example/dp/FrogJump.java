package org.example.dp;

import java.util.Arrays;
import java.util.Scanner;

public class FrogJump {
    static int[] heights;
    static int[] dp;

    public int func1(int n){
        int cost = Integer.MAX_VALUE;
        if (n==0) return 0;
        if (dp[n]!=-1){
            return dp[n];
        }
        cost = Math.min(cost,func1(n-1)+Math.abs(heights[n]-heights[n-1]));
        if (n>1){
            cost = Math.min(cost,func1(n-2)+Math.abs(heights[n]-heights[n-2]));
        }
        return dp[n] = cost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of stones
        int N = scanner.nextInt();
        
        // Read heights of stones
        heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }
        dp = new int[N];
        Arrays.fill(dp,-1);
        FrogJump frogJump = new FrogJump();
        int n = frogJump.func1(N-1);
        System.out.println(n);
        scanner.close();
    }
}
