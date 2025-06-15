package org.general.sorting;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        sortArrayByParity(nums);
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }

    // we will sort for even and odd will be sorted automatically
    public static void sortArrayByParity(int[] nums) {
        int l = 0;
        for (int i = 0; i < nums.length;i++) {
            if (nums[i] % 2 == 0) {
                swap(nums, l, i);
                l++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
