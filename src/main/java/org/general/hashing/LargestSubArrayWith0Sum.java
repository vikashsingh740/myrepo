package org.general.hashing;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWith0Sum {
    public static void main(String[] args) {
        int[] a = {15, -2, 2, -8, 1, 7, 10, 23};
        int k = 0;
        int x = largestSubArray(a, k);
        System.out.println(x);
    }

    public static int largestSubArray(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;
        int sum = 0;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                maxLen = Math.max(maxLen, i - preSumMap.get(rem));
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
}
