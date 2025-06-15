package org.general.stack;

import java.util.Stack;

class LongestValidParentheses {
    public static void main(String[] args) {
        String s = "()(()";
        int c = longestValidParentheses(s);
        System.out.println(c);
    }
    public static int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == '(' && ch == ')') {
                count += 2;
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return count;
    }
}