package org.example.leetcode.array;

public class WaterTrapping {
    public static void main(String[] args) {
        int[] a = {4,2,0,3,2,5};
        int[] left = new int[a.length];
        int[] right = new int[a.length];

        left[0] = a[0];
        for (int i=1;i<a.length;i++){
            left[i] = Math.max(a[i],left[i-1]);
        }
        right[a.length-1] = a[a.length-1];
        for (int j=a.length-2;j>=0;j--){
            right[j] = Math.max(a[j],right[j+1]);
        }
        int water = 0;
        for (int i=0;i<a.length;i++){
            water += Math.min(left[i], right[i]) - a[i];
        }
        System.out.println(water);
    }
}
