package org.general.hashing;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k =3;
        int x = kthLargestElement(nums,k);
        System.out.println(x);
    }

    public static int kthLargestElement(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
