package org.example.leetcode.array;

public class MinMergeToMakePalindromeArray {

    public int minMergeToMakePalindromeArray(int[] a1) {
        int ans = 0;
        int i = 0;
        int j = a1.length-1;
        while (i<j){
         if (a1[i] == a1[j]){
             i++;
             j--;
         } else if(a1[i]<a1[j]){
             i++;
             a1[i] = a1[i]+a1[i-1];
             ans++;
         }else {
             j--;
             a1[j] = a1[j]+a1[j+1];
             ans++;
         }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 9, 1};
        MinMergeToMakePalindromeArray minMergeToMakePalindromeArray = new MinMergeToMakePalindromeArray();
        int x = minMergeToMakePalindromeArray.minMergeToMakePalindromeArray(a);
        System.out.println(x);
    }
}
