package org.general.stack;

import java.util.Stack;

public class LargestRectangleInHistogram1 {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        //Output: 10
        int[] nse = nextSmaller(heights);
        int[] pse = prevSmaller(heights);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
           int area = heights[i] * (nse[i]-pse[i]-1);
           max = Integer.max(area,max);
        }
        System.out.println(max);
    }

    public static int[] nextSmaller(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int[] res = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
               stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = n;
            }else{
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }

    public static int[] prevSmaller(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int[] res = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
}
