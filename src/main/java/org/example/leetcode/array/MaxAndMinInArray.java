package org.example.leetcode.array;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        int[] a = {6,4,1,2,9,7,-2,10};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
          max = Math.max(a[i],max);
          min = Math.min(a[i],min);
        }
        System.out.println("Max "+max);
        System.out.println("Min "+min);
    }
}
