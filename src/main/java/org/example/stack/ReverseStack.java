package org.example.stack;

import java.util.Stack;

public class ReverseStack {

    PushAtBottom pushAtBottom = new PushAtBottom();

    private void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()){
            return;
        }
        int data = stack.pop();
        reverse(stack);
        pushAtBottom.pushAtBottom(stack,data);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        ReverseStack reverseStack = new ReverseStack();
        reverseStack.reverse(stack);
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
