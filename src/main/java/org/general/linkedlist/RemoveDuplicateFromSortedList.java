package org.general.linkedlist;


public class RemoveDuplicateFromSortedList {

    public static void display(ListNode node) {
        ListNode n = node;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void removeDuplicate(ListNode node) {
        ListNode current = node;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    // 1 2 2 3 3 5 6 6 7 8 8
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(2);
        node1.next.next.next = new ListNode(3);
        node1.next.next.next.next = new ListNode(3);
        node1.next.next.next.next.next = new ListNode(5);
        node1.next.next.next.next.next.next = new ListNode(6);
        node1.next.next.next.next.next.next.next = new ListNode(6);
        node1.next.next.next.next.next.next.next.next = new ListNode(7);
        node1.next.next.next.next.next.next.next.next.next = new ListNode(8);
        node1.next.next.next.next.next.next.next.next.next.next = new ListNode(8);
        display(node1);
        System.out.println();
        removeDuplicate(node1);
        display(node1);
    }
}
