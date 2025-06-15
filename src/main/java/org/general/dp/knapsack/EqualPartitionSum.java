package org.general.dp.knapsack;

public class EqualPartitionSum {
    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        System.out.println(equalSumPartition(nums));
    }

    public static boolean equalSumPartition(int[] nums){
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum%2 != 0){
            return false;
        }
        return isSubsetSum(nums, sum/2, nums.length);
    }

    private static boolean isSubsetSum(int[] nums, int sum, int n) {
        boolean[][] t = new boolean[n + 1][sum + 1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i == 0){
                    t[i][j] = false;
                }
                if(j==0){
                    t[i][j] = true;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if (j >= nums[i - 1]) {
                    t[i][j] = t[i - 1][j - nums[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];
    }
}
