package org.example.leetcode.array;

class SubArrayMaxSum {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sumTillNow = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Update the current subarray sum
            sumTillNow = Math.max(nums[i], sumTillNow + nums[i]);
            // Update the maximum sum found so far
            maxSum = Math.max(maxSum, sumTillNow);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(maxSubArray(a));
    }
}