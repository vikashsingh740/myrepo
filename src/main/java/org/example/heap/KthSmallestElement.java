package org.example.heap;

import java.util.PriorityQueue;
import java.util.Collections;

public class KthSmallestElement {

    public static int findKthSmallest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid input");
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        // The root of the max-heap is the k-th smallest element
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        
        try {
            int kthSmallest = findKthSmallest(arr, k);
            System.out.println("The " + k + "-th smallest element is " + kthSmallest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
