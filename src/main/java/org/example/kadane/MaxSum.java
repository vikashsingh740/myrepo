package org.example.kadane;

public class MaxSum {
    public static void main(String[] args) {
        int[] a = {2,-3,4,0,6,7,-2};
        int current = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if (current<0){
                current=a[i];
            }else {
                current+=a[i];
            }
            if (current>maxSum){
                maxSum=current;
            }
        }
        System.out.print("====>>> "+maxSum);
    }
}
