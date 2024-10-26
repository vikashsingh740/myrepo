package org.example.heap;

import java.util.PriorityQueue;

public class FindKthMax {
    public static void main(String[] args) {
        int k= 3;
        int[] a = {4,2,8,5,10,9,4}; // need to find 3rd max item
        // Min Heap
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int x : a){
            priorityQueue.add(x);
            if (priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        System.out.println("3rd max will be "+priorityQueue.peek());
    }
}
