package org.example.leetcode.array;

class FindMinInSortedRotatedArray {
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start < end) {
            mid = (start + end) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        int[] a = {5,6,7,1,2,3,4};
        int x = findMin(a);
        System.out.print(x);
    }

}