package org.example.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lis {
    static int[] a = {10,9,2,5, 3,7,101,18};
    static int[] dp = new int[a.length];
    public static int lis(int n){
        if (dp[n] !=-1){
            return dp[n];
        }
        int sol = 1;
        for (int j=0;j<n;j++){
            if (a[j]<a[n]){
                sol = Math.max(sol,lis(j)+1);
            }
        }
        return dp[n]=sol;
    }
    public static void main(String[] args) {
        Arrays.fill(dp,-1);
        int max = 0;
        for (int i=0;i<a.length;i++){
            max = Math.max(0,lis(i));
        }
        System.out.println(max);
    }
}
