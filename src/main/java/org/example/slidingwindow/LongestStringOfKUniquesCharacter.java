package org.example.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestStringOfKUniquesCharacter {
    public static void main(String[] args) {
        // Find the longest substring with k unique character in a given string
        String s1 = "aabbcdcddd";
        int k = 2;
        Map<Character,Integer> map = new HashMap<>();
        int start = 0;
        int max = Integer.MIN_VALUE;
        for (int end=0;end<s1.length();end++){
           map.put(s1.charAt(end),map.getOrDefault(s1.charAt(end),0)+1);
           while (map.size()> k){
               map.put(s1.charAt(start),map.get(s1.charAt(start))-1);
               if (map.get(s1.charAt(start)) ==0){
                   map.remove(s1.charAt(start));
               }
               start++;
           }
           if (map.size()==k){
               max = Math.max(max,(end-start)+1);
           }
        }
        System.out.println("======>>> "+max);
    }
}
