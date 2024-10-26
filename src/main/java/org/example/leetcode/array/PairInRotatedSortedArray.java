package org.example.leetcode.array;

public class PairInRotatedSortedArray {

    public static boolean findPair(int[] a, int x){
        // find pivot item
        int n = a.length;
        int pivot=-1;
        for (int i=0;i<a.length-1;i++){
            if (a[i]>a[i+1]){
                pivot = i;
                break;
            }
        }
        int left = (pivot+1)%n;
        int right = pivot;
        while (left!=right){
            if (a[left]+a[right]==x){
                return true;
            }else if (a[left]+a[right]<x){
                left = (left+1) % n;
            }else {
                right = (n+ right-1)%n;
            }
        }
      return false;
    }

    public static void main(String[] args) {
      int[] a = {6,7,8,1,2,4,5};
      boolean pairFound = findPair(a,12);
      System.out.print("pair found "+pairFound);
    }
}
