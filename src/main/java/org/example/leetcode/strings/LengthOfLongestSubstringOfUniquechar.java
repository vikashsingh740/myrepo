package org.example.leetcode.strings;

class LengthOfLongestSubstringOfUniquechar {
    public int lengthOfLongestSubstring(String s) {
        char[] ss = s.toCharArray();
        int left = 0, ans = 0;
        boolean[] has = new boolean[128];
        for (int right = 0; right < ss.length; right++) {
            char c = ss[right];
            while (has[c]) {
                has[ss[left]] = false;
                left++;
            }
            has[c] = true;
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
    }
}