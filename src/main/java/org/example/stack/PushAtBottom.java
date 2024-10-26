package org.example.stack;

import java.util.Stack;

public class PushAtBottom {

    public void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack,data);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        PushAtBottom pushAtBottom = new PushAtBottom();
        pushAtBottom.pushAtBottom(stack,5);
        System.out.println(stack);
    }
}
