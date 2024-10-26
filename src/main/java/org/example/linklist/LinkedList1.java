package org.example.linklist;

public class LinkedList1 {

    public Node reverse(Node head){
      Node prev = null;
      Node next = null;
      Node current = head;
      while (current!=null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      }
      return prev;
    }

    public Node reverseUsingRecursion(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node newNode = reverseUsingRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public void disPlay(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "==>");
            n = n.next;
        }
    }

    public Node addNode(Node head, int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return head;
        }
        Node n1 = head;
        while (n1.next != null) {
            n1 = n1.next;
        }
        n1.next = node;
        return head;
    }

    public int size(Node head) {
        int i=0;
        while (head !=null){
            i++;
            head=head.next;
        }
        return i;
    }

    public void removedNthFrmEnd(Node head, int indx) {
        int size = size(head);
        int i = 1;
        Node prev = head;
        while (i<size-indx){
            prev= prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    public boolean palindrome(Node head) {
        Node fast = head;
        Node slow = head;
        int i = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node reversed = reverse(slow);
        while (reversed != null) {
            if (reversed.data != head.data) {
                return false;
            }
            reversed = reversed.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList1 linkedList1 = new LinkedList1();
        Node head = new Node(5);
        head = linkedList1.addNode(head,6);
        head = linkedList1.addNode(head,10);
        head = linkedList1.addNode(head,20);
        head = linkedList1.addNode(head,20);
        head = linkedList1.addNode(head,10);
        head = linkedList1.addNode(head,6);
        head = linkedList1.addNode(head,5);

        linkedList1.disPlay(head);
        System.out.println();
        Node n = linkedList1.reverseUsingRecursion(head);
        linkedList1.disPlay(n);
        System.out.println();
        System.out.println(linkedList1.size(n));
        System.out.println();
//        linkedList1.removedNthFrmEnd(n,2);
//        linkedList1.disPlay(n);
        System.out.println("Palindrome ===>> "+linkedList1.palindrome(n));
    }
}
