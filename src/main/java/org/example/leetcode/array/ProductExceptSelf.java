package org.example.leetcode.array;

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1]*nums[i-1];
        }
        right[nums.length-1] = 1;
        for(int j=nums.length-2;j>=0;j--){
            right[j] = right[j+1]*nums[j+1];
        }
        int[] ans = new int[nums.length];
        for(int k=0;k<ans.length;k++){
            ans[k] = left[k]*right[k];
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}