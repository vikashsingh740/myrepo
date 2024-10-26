package org.example.leetcode.stack;

public class ImplementTwoStackInArray {

    int arr[];
    int tos1;
    int tos2;
    int size;

    public ImplementTwoStackInArray(int n) {
        arr = new int[n];
        tos1 = -1;
        tos2 = n;
        size = n;
    }

    public void push1(int data) {
        if (tos1 < tos2 - 1) {
            tos1++;
            arr[tos1] = data;
        } else {
            System.out.print("stack overflow");
            return;
        }
    }

    public void push2(int data) {
        if (tos1 < tos2 - 1) {
            tos2--;
            arr[tos2] = data;
        } else {
            System.out.print("stack overflow");
            return;
        }
    }

    public int pop1() {
        if (tos1 >= 0) {
            int x = arr[tos1];
            tos1--;
            return x;
        } else {
            System.out.print("stack is underflow");
            return -1;
        }
    }

    public int pop2() {
        if (tos2 < size) {
            int x = arr[tos2];
            tos2++;
            return x;
        } else {
            System.out.print("stack is underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
        ImplementTwoStackInArray is = new ImplementTwoStackInArray(5);
        is.push1(10);
        is.push1(20);
        is.push1(30);
        is.push2(40);
        is.push2(50);

        System.out.println("pop from stack1 " + is.pop1());
        System.out.println("pop from stack2 " + is.pop2());
        System.out.println("pop from stack1 " + is.pop1());
        System.out.println("pop from stack2 " + is.pop2());
    }
}
