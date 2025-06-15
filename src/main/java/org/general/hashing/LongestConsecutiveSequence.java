package org.general.hashing;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] num = {0,3,7,2,5,8,4,6,0,1}; //1 2 3 4 100 200
        Arrays.sort(num);
        int count = 1;
        int i=0,j=i+1;
        while(j<num.length){
            if(num[i]+1 == num[j]){
                count++;
            }
            i++;
            j++;
        }
        System.out.println(count);
    }
}
