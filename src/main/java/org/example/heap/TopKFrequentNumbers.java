package org.example.heap;

import java.util.*;

public class TopKFrequentNumbers {
    
    // Function to find the top k frequent numbers
    public static List<Integer> topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        
        // Step 1: Count frequencies using a hash map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a min-heap to keep track of top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the least frequent element
            }
        }

        // Extract the top k frequent elements from the min-heap
        List<Integer> topK = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            topK.add(minHeap.poll().getKey());
        }
        
        // Return the result in the order of their frequency
        Collections.reverse(topK);
        return topK;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        try {
            List<Integer> topKFrequent = topKFrequent(nums, k);
            System.out.println("Top " + k + " frequent numbers: " + topKFrequent);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
