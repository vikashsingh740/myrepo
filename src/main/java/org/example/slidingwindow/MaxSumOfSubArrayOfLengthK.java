package org.example.slidingwindow;

public class MaxSumOfSubArrayOfLengthK {
    // Write a program to find max sum of a sunArray of Length K
    public static void main(String[] args) {
        findMaxSumOfSubArrayLengthK1();
        findMaxSumOfSubArrayLengthK2();
    }

    private static void findMaxSumOfSubArrayLengthK1() {
        int[] a = {1, 6, 9, 4, 7, 6, 3, 2};
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int i=0,k=3;
        for(int j=0;j<a.length;j++){
            sum+=a[j];
            if(j-1+1==k){
                maxSum = Math.max(maxSum,sum);
                i++;
            }
        }
        System.out.println("====>> "+maxSum);
    }

    private static void findMaxSumOfSubArrayLengthK2() {
        int[] a = {1, 6, 9, 4, 7, 6, 3, 2};
        int maxSum = 0;
        int sum = 0;
        int k=3;
        for(int j=0;j<k;j++){
            maxSum+=a[j];
        }
        for (int i=k;i<a.length;i++){
            sum = maxSum+a[i]-a[i-k];
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println("====>> "+maxSum);
    }
}
