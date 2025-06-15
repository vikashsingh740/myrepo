package org.general.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        //Output: [1,1,4,2,1,1,0,0]
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                res[i] = stack.peek()-i;
            }
            stack.push(i);
        }
        System.out.println(res);
    }
}
