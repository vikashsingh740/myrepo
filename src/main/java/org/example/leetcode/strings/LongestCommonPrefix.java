package org.example.leetcode.strings;
import java.util.Arrays;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        char[] c1 = strs[0].toCharArray();
        char[] c2 = strs[strs.length-1].toCharArray();
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
               break;
            }
            sb.append(c1[i]);
        }
        return sb.toString();
    }
}