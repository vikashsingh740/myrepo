package org.general.sorting;

public class InversionCount {

    static int count = 0;
    public static void main(String[] args) {
        int[] nums = {8, 4, 2, 1};
        mergeSort(nums, 0, nums.length-1);
        for (int x : nums){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(count);
    }

    public static void mergeSort(int[] nums, int s, int e) {
        if (s == e) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSort(nums, s, mid);
        mergeSort(nums, mid + 1, e);
        merge(nums, s, mid, e);
    }

    private static void merge(int[] nums, int s, int mid, int e) {
        int a = s;
        int b = mid + 1;
        int[] temp = new int[e-s+1];
        int k = 0;
        while (a <= mid && b <= e) {
            if (nums[a] <= nums[b]) {
                temp[k++] = nums[a++];
            } else {
                count+= mid-a+1;
                temp[k++] = nums[b++];
            }
        }
        while (a <= mid) {
            temp[k++] = nums[a++];
        }
        while (b <= e) {
            temp[k++] = nums[b++];
        }
        for (int i = 0,j=s; i < temp.length; i++,j++) {
            nums[j] = temp[i];
        }
    }
}
