package org.example.slidingwindow;

public class MinLenOfSum20 {
    public static void main(String[] args) {
        int[] a = {2,8,10,1,1,7,9,11};

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int right=0;right<a.length;right++){
            sum+=a[right];
                while (sum>=20){
                    minLength = Math.min(minLength,right-left+1);
                    sum-=a[left++];
                }
        }
        System.out.println(minLength);
    }
}
