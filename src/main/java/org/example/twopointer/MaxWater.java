package org.example.twopointer;

public class MaxWater {

    public int maxWater(int[] a) {
        int i = 0;
        int j = a.length - 1;
        int maxArea = Integer.MIN_VALUE;
        int area = 0;
        while (i < j) {
            int b = j - i;
            int l = Math.min(a[i], a[j]);
            area = l * b;
            maxArea = Math.max(maxArea, area);
            if(a[i]<a[j]){
                i++;
            }else {
                j--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] a = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        MaxWater maxWater = new MaxWater();
        int water = maxWater.maxWater(a);
        System.out.println(water);
    }
}
