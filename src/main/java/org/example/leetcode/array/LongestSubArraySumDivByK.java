package org.example.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySumDivByK {

    public int longestSubArraySumDivByK(int[] a, int k){
        int sum=0;
        int maxLength=0;
        int rem = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1); // to handle the index starting from 0th index
        for (int i=0;i<a.length;i++){
            sum += a[i];
            rem = sum % k;
            if (rem<0){
                rem = rem+k;
            }
            if (map.containsKey(rem)){
                maxLength = Math.max(maxLength,i-map.get(rem));
            }else{
                map.put(rem,i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 6, 1, 4, 5};
        int k = 3;
        LongestSubArraySumDivByK ll = new LongestSubArraySumDivByK();
        int len = ll.longestSubArraySumDivByK(arr,3);
        System.out.print(len);
    }
}
