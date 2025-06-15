package org.general.slidingwindow;

import java.util.*;

public class SlidingWindowMaximum1 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = slidingWindowMaximum(nums,3);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] slidingWindowMaximum(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        while(end<nums.length){
          if(nums[end] < 0){
              list.add(nums[end]);
          }
         if ((end-start+1) == k) {
              if(!list.isEmpty()){
                  res[start] = list.get(0);
                  if(list.get(0) == nums[start]){
                      list.remove(0);
                  }
              }else {
                  res[start] = 0;
              }
              start++;
          }
            end++;
        }
        return res;
    }
}
