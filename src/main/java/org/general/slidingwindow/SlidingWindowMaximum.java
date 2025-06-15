package org.general.slidingwindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = slidingWindowMaximum(nums,3);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] slidingWindowMaximum(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int n = nums.length;
        int[] res = new int[n-k+1];
        Deque<Integer> deque = new ArrayDeque<>();

        while (end < n){
            while (!deque.isEmpty() && deque.peekLast() <= nums[end]){
               deque.pollLast();
            }
            deque.offerLast(end);
            if(deque.peekFirst() < start){
                deque.pollFirst();
            }
            if(end - start + 1 == k){
               res[start] = nums[deque.peekFirst()];
               start++;
            }
            end++;
        }
        return res;
    }
}
