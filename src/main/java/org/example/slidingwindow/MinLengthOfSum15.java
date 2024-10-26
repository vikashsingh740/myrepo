package org.example.slidingwindow;

public class MinLengthOfSum15 {
    // write a program to find min length of subArray of length 15
    public static void main(String[] args) {
        int[] a = {1, 6, 9, 4, 7, 6, 3, 2};
        int sum = 15;
        int sum1 = 0;
        int len = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0;right<a.length;right++){
            sum1+=a[right];
            while (sum1>=sum){
                len = Math.min(len,right-left+1);
                sum1-=a[left++];
            }
        }
        System.out.println("====>> " + len);
    }
}
