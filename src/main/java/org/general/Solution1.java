package org.general;

class Solution1 {
    public static void main(String[] args) {
        int[] a = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(a));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}