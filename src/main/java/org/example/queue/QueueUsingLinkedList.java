package org.example.queue;

public class QueueUsingLinkedList {
    Node head=null;
    Node tail=null;

    public boolean isEmpty(){
        return head==null;
    }

    public void add(int data){
       Node node = new Node(data);
       if (isEmpty()){
           head= node;
           tail=node;
           return;
       }
       tail.next=node;
       tail=node;
    }

    public int remove(){
        if (isEmpty()){
            return -1;
        }
        if (head==tail){
            tail=null;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public int peek(){
        if (isEmpty()){
            return -1;
        }
        int data = head.data;
        return data;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
        queueUsingLinkedList.add(10);
        queueUsingLinkedList.add(20);
        queueUsingLinkedList.add(30);
        queueUsingLinkedList.remove();
        queueUsingLinkedList.add(40);
        while (!queueUsingLinkedList.isEmpty()){
            System.out.print(queueUsingLinkedList.remove()+" ");
        }
    }
}
