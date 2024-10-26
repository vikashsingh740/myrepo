package org.example.heap;

import org.example.dp.Lis;

import java.util.*;

public class TopFrequentNumbersTest {
    public static void main(String[] args) {
        // find top 2 frequent numbers
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        Map<Integer,Integer> map = new HashMap<>();
        for (int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        // As we want to find frequent numbers means number with MAX count,
        //so queue will be mean heap, will be sorted on frequency
        PriorityQueue<Map.Entry<Integer,Integer>> priorityQueue = new PriorityQueue<>((a,b)-> a.getValue().compareTo(b.getValue()));

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            priorityQueue.offer(entry);
            if (priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        List<Integer> numbersList = new ArrayList<>();
        while (!priorityQueue.isEmpty()){
            numbersList.add(priorityQueue.poll().getKey());
        }
        System.out.println("Frequent numbers" +numbersList);
    }
}
