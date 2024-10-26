package org.example.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;

public class FormLargestNumberInArray {
    public String formLargestNumber(int[] x){
        String[] s = new String[x.length];
        for (int i=0;i<x.length;i++){
            s[i] = String.valueOf(x[i]);
        }
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String numOne = o1+o2;
                String numTwo = o2+o1;
                return numTwo.compareTo(numOne);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String s1 : s){
            sb.append(s1);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int[] a = {21,41,11,88,9};
        FormLargestNumberInArray formLargestNumberInArray = new FormLargestNumberInArray();
        String largestNumber = formLargestNumberInArray.formLargestNumber(a);
        System.out.print(largestNumber);
    }
}
