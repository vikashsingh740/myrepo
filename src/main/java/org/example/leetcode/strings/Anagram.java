package org.example.leetcode.strings;

class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] c = new int[26];
        for(char ch : s.toCharArray()){
           c[ch-97]++;
        }
        for(char ch : t.toCharArray()){
           c[ch-97]--;
        }
        for(int x : c){
            if(x!=0){
                return false;
            }
        }
        return true;
    }
}