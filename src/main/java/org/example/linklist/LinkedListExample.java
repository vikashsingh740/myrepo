package org.example.linklist;

public class LinkedListExample {
    Node head=null;

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void disPlay() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "==>");
            n = n.next;
        }
    }

    public void reverse() {
       Node nextNode = null;
       Node prevNode = null;
       Node currentNode = head;

       while (currentNode!=null){
         nextNode = currentNode.next;
         currentNode.next=prevNode;
         prevNode=currentNode;
         currentNode=nextNode;
       }
       head = prevNode;
    }

    public void remove(int indx){
       int i = 1;
       Node n = head;
       Node prev;
       while (n!=null && n.next!=null){
           prev = n;
           n = n.next;
           i++;
           if (indx==i){
              prev.next = n.next;
           }
       }
    }

    public void rotate(int k){
        Node n = head;
        Node kth = null;
        int i=1;
        while (n!=null && n.next!=null){
            n = n.next;
            i++;
            if (i==k-1){
                kth = n;
            }
        }
        n.next = head;
        head = kth.next;
        kth.next=null;
    }

    public static void main(String[] args) {
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.add(2);
        linkedListExample.add(4);
        linkedListExample.add(6);
        linkedListExample.add(8);
        linkedListExample.disPlay();
        System.out.println();
        linkedListExample.reverse();
        linkedListExample.disPlay();
        System.out.println();
        //linkedListExample.remove(4);
        linkedListExample.rotate(3);
        linkedListExample.disPlay();
    }
}
