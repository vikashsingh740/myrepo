package org.general.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram2(str1,str2));
    }

    public static boolean isAnagram2(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s2.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public static boolean isAnagram1(String s1, String s2){
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int i=0;
        int j=0;
        while (i < ch1.length && j < ch2.length) {
           if(ch1[i++] != ch2[j++]){
               return false;
           }
        }
        if(i<ch1.length || j < ch2.length){
          return false;
        }
        return true;
    }
}
