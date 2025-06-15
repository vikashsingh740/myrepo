package org.general.sorting;

import java.util.Arrays;

public class MergeSort {

    static int count = 0;
    public static void main(String[] args) {
        int[] nums = {4, 2, 1, 7, 8, 6, 5};
        mergeSort(nums,0,nums.length-1);
        System.out.println(count);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static void mergeSort(int[] nums, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + (r - l) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        merge(nums, l, mid, r);
    }

    public static void merge(int[] nums, int l, int mid, int r) {
        int a = l;
        int b = mid + 1;
        int k = 0;
        int[] merged = new int[r - l + 1];
        while (a <= mid && b <= r) {
            if (nums[a] <= nums[b]) {
                merged[k++] = nums[a++];
            } else {
                count += mid-a+1; // this line is only required to count pair where i<j and a[i]>a[j]
                merged[k++] = nums[b++];
            }
        }
        while (a <= mid){
            merged[k++] = nums[a++];
        }
        while (b <= r){
            merged[k++] = nums[b++];
        }
        for (int i = 0,j=l; i < merged.length; i++,j++) {
            nums[j] = merged[i];
        }
    }
}
