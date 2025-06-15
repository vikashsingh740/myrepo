package org.general.linkedlist;

public class RemoveNthFromTheEnd {

    public static void display(ListNode node) {
        ListNode n = node;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    } // 1 2 3 4 5 6 7

    public static ListNode removeNth(ListNode node, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = node;
        ListNode node1 = dummy;
        ListNode node2 = dummy;
        for (int i = 0; i < n; i++) {
            node2 = node2.next;
        }
        while (node2 != null && node2.next != null) {
            node2 = node2.next;
            node1 = node1.next;
        }
        node1.next = node1.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(10);
        node1.next = new ListNode(20);
        node1.next.next = new ListNode(30);
        node1.next.next.next = new ListNode(40);
        node1.next.next.next.next = new ListNode(50);
        node1.next.next.next.next.next = new ListNode(60);
        removeNth(node1,2);
        display(node1);
    }
}
