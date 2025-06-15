package org.general.variableSlidingwindow;

public class LongestSubStringOfKUniqueElement {
    public static void main(String[] args) {
        String str = "aabcddefgh";

        int i = 0;
        int j = 0;
        int[] frequency = new int[26];
        int uniqueElements = 0;
        int k = 4;
        int ans = Integer.MIN_VALUE;

        while (j < str.length()) {
            int index = str.charAt(j) - 97;
            if (frequency[index] == 0) {
                frequency[index]++;
                uniqueElements++;
            } else {
                frequency[index]++;
            }

            if (uniqueElements < k) {
                j++;
            } else {
                while (uniqueElements > k) {
                    index = str.charAt(i) - 97;
                    frequency[index]--;
                    if(frequency[index] == 0){
                        uniqueElements--;
                    }
                    i++;
                }
                j++;
            }
            if (uniqueElements == k) {
                int len = j - i + 1;
                ans = Math.max(len, ans);
            }
        }
        System.out.println(ans);
    }
}
