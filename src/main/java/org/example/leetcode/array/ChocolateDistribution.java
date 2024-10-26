package org.example.leetcode.array;

import java.util.Arrays;

public class ChocolateDistribution {

    public static int chocolateDistribution(int[] a, int m){
        Arrays.sort(a);
        int minDiff = Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++){
          int nextWindow = i+(m-1);
          if (nextWindow>=a.length){
              break;
          }
          int diff = a[nextWindow] - a[i];
            minDiff = Math.min(minDiff,diff);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        //Output: Minimum Difference is 6
        System.out.println(chocolateDistribution(arr,m));
    }
}
