package org.general.linkedlist;


public class RemoveDuplicateFromSortedList2 {

    public static void display(ListNode node) {
        ListNode n = node;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static ListNode removeDuplicate(ListNode node) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        ListNode current = node;
        dummy.next=node;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                prev.next = current.next.next;
                current=prev.next;
            } else {
                current = current.next;
                prev =prev.next;
            }
        }
        return dummy.next;
    }

    // 1 2 3 3 4 4 5
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(3);
        node1.next.next.next.next = new ListNode(4);
        node1.next.next.next.next.next = new ListNode(4);
        node1.next.next.next.next.next.next = new ListNode(5);
        display(node1);
        System.out.println();
        ListNode n = removeDuplicate(node1);
        display(n);
    }
}
