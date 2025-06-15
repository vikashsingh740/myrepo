package org.general;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,1,2,3,4};
    }

    public static int findPeakElement(int[] nums) {
        int peak = Integer.MIN_VALUE;
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start+(end-start)/2;
            if(nums[mid] > nums[start]){
                peak = mid;
                
            }
        }
        return 0;
    }
}
