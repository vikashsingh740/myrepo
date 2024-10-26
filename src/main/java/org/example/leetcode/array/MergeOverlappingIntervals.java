package org.example.leetcode.array;

import java.util.*;

class MergeOverlappingIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));
        int[] newIntervals = intervals[0];
        result.add(newIntervals);
        for(int[] interval : intervals){
           if(interval[0]<= newIntervals[1]){
             newIntervals[1] = Math.max(newIntervals[1],interval[1]);
           }else{
             newIntervals = interval; 
             result.add(newIntervals);
           }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        //intervals = {{1,3},{2,6},{8,10},{15,18}};
    }
}