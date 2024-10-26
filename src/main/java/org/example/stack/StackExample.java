package org.example.stack;

public class StackExample {
    Node1 head;

    public boolean isEmpty(){
        return head==null;
    }

    public void push(int data){
        Node1 node = new Node1(data);
        if (isEmpty()){
            head=node;
        } else {
            node.next=head;
            head=node;
        }
    }

    public int pop(){
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek(){
        return head.data;
    }

    public static void main(String[] args) {
       StackExample stackExample = new StackExample();
       stackExample.push(10);
        stackExample.push(20);
        stackExample.push(30);
        stackExample.push(40);

        while (!stackExample.isEmpty()){
            System.out.print(stackExample.pop()+" ");
        }
    }
}
