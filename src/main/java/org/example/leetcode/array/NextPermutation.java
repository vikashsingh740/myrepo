package org.example.leetcode.array;

public class NextPermutation {

    public static void nextPermutation(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = a.length - 1;
            while (a[j] <= a[i]) {
                j--;
            }
            swap(a, i, j);
        }
        reverse(a,i+1,a.length-1);
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    public static void reverse(int[] a, int i, int j){
        while (i < j){
            swap(a,i++,j--);
        }
    }

    public static void main(String[] args) {
        int[] x = {9, 8, 5, 7, 6};
        // output should be 9,8,6,5,7
        nextPermutation(x);
        for (int x1 : x){
            System.out.print(x1+" ");
        }
    }
}
