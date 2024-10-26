package org.example.leetcode.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthMinInArray {
    public static void main(String[] args) {
        int[] a = {7,4,1,9,13,2,3,15};
        // find 3rd smallest
        int k = 3;
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : a){
            queue.add(x);
            if (queue.size()>k){
                queue.poll();
            }
        }
        System.out.print("kth Min ==> "+ queue.peek());
    }
}
