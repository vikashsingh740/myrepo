package org.general.variableSlidingwindow;

public class LargestSubArrayOfSumK {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int k = 5;
        int[] a = {4, 1, 1, 1, 2, 3, 5};
        int ans = 0;
        while (j < a.length) {
          sum+=a[j];
          if(sum < k){
              j++;
          }else {
              while (sum > k){
                  sum -= a[i];
                  i++;
              }
              if(sum == k){
                  ans = Math.max(ans,j-i+1);
              }
              j++;
          }
        }
        System.out.println(ans);
    }
}
