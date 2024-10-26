package org.example.leetcode.strings;

class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String lps = "";
        for (int i = 1; i < s.length(); i++) {
            // consider odd length
            int low = i;
            int high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low==-1 || high==s.length()){
                    break;
                }
            }
            String palindrome = s.substring(low+1,high);
            if(palindrome.length()>lps.length()){
                lps = palindrome;
            }

            // consider even length
             low = i-1;
             high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low==-1 || high==s.length()){
                    break;
                }
            }
            palindrome = s.substring(low+1,high);
            if(palindrome.length()>lps.length()){
                lps = palindrome;
            }
        }
        return lps;

    }
}