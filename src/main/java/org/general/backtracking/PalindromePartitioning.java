package org.general.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
      // a a b
        String s = "aab";
        List<List<String>> res = new ArrayList<>();
        partitioning(res,new ArrayList<>(),0,s);
        System.out.println(res);
    }

    public static void partitioning(List<List<String>> res, List<String> current, int start, String s) {
        if (start == s.length()) {
            res.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (ispalindrome(s, start, i)) {
                String part = s.substring(start, i + 1);
                current.add(part);
                partitioning(res, current, i + 1, s);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean ispalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
