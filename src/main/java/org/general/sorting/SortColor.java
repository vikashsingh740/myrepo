package org.general.sorting;

public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        for (int x : nums) {
            System.out.print(x);
        }
    }

    public static void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        for (int i = 0; i <= r; ) {
            if (nums[i] == 0) {
                swap(nums, i, l);
                l++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, r);
                r--;
            } else if (nums[i] == 1) {
                i++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
