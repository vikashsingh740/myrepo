package org.general.sorting;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualToK {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k =2;
        int x = countSubArrayWithSumEqualToK(nums,k);
        System.out.println(x);
    }

    public static int countSubArrayWithSumEqualToK(int[] nums, int k) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        int sum = 0;
        int count = 0;
        prefixSum.put(0,1);
        for (int i=0;i<nums.length;i++){
            sum += nums[i];
            if(prefixSum.containsKey(sum-k)){
                count += prefixSum.get(sum-k);
            }
            prefixSum.put(sum,prefixSum.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
