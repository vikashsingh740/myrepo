package org.example.leetcode.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {4, 5, 1, 2};
        int i = 0;
        int j = a.length-1;
        while (i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for (int x : a){
            System.out.print(x+" ");
        }
    }
}
