package org.example.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringOf2UniqueCharacter {
    public static void main(String[] args) {
        String s1 = "aabbcdc";
        int start=0;
        int maxLenght = Integer.MIN_VALUE;
        Map<Character,Integer> map = new HashMap<>();
        for (int end=0;end<s1.length();end++){
           map.put(s1.charAt(end),map.getOrDefault(s1.charAt(end),0)+1);
           while (map.size()>2){
               map.put(s1.charAt(start),map.get(s1.charAt(start))-1);
               if (map.get(s1.charAt(start))==0){
                   map.remove(s1.charAt(start));
               }
               start++;
           }
            if (map.size()==2){
                maxLenght = Math.max(maxLenght,(end-start)+1);
            }
        }
        System.out.println("===>>>" +maxLenght);
    }
}
