package org.general.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {4, 2, 1, 7, 8, 6, 5};
        quickSort(nums,0,nums.length-1);
        for(int y : nums){
            System.out.print(y+" ");
        }
    }

    public static void quickSort(int[] nums, int start, int end) {
        if (start >= end){
            return;
        }
        int r = partition(nums, start, end);
        quickSort(nums, start, r - 1);
        quickSort(nums, r + 1, end);
    }

    private static int partition(int[] nums, int start, int end) {
        int l = start + 1;
        int r = end;
        while (l <= r) {
            if (nums[l] <= nums[start]) {
                l++;
            } else if (nums[r] > nums[start]) {
                r--;
            } else {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
            }
        }
        int temp = nums[r];
        nums[r] = nums[start];
        nums[start] = temp;
        return r;
    }
}
