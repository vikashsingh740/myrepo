package org.example.leetcode.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,8,13,20};
        int n = 8;
        int x = bs(nums, n);
        System.out.print(x);
    }

    private static int bs(int[] nums, int n) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == n) {
                return mid;
            } else if (nums[mid] > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
