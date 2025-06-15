package org.general.stack;

import java.util.Map;
import java.util.Stack;

public class SecondLargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int n = heights.length;
        //Output: 10
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
          while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
              int item = stack.pop();
              int element = heights[item];
              int prev = stack.isEmpty() ? -1 : stack.peek();
              max = Math.max(max,element * (i-prev-1));
          }
          stack.push(i);
        }
        while (!stack.isEmpty()){
            int item = stack.pop();
            int element = heights[item];
            int prev = stack.isEmpty() ? -1 : stack.peek();
            max = Math.max(max,element * (n-prev-1));
        }
        System.out.println(max);
    }
}
