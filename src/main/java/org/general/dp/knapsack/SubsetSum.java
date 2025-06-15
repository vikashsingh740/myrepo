package org.general.dp.knapsack;

public class SubsetSum {
    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = nums.length;
        System.out.println(isSubsetSum(nums,sum,n));
    }

    public static boolean isSubsetSum(int[] nums, int sum, int n) {
        boolean[][] t = new boolean[n + 1][sum + 1];
        //initialization
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    t[i][j] = false;
                }
                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (j >= nums[i - 1]) {
                    t[i][j] = (t[i - 1][j - nums[i - 1]]) || (t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];
    }
}
