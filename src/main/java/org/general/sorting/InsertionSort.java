package org.general.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int nums[] = {4, 2, 1, 7, 8, 6, 5};
        sort(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            while (j >= 0 && (nums[j] > current)) {
               nums[j+1] = nums[j];
               j--;
            }
            nums[j+1] = current;
        }
    }
}
