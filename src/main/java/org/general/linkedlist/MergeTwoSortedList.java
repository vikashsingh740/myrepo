package org.general.linkedlist;

public class MergeTwoSortedList {

    public static void display(ListNode node) {
        ListNode n = node;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static ListNode merge(ListNode node1, ListNode node2) {
        ListNode retunedNode = new ListNode(-1);
        ListNode newHead = retunedNode;
        while (node1 != null && node2 != null) {
            if (node1.data <= node2.data) {
                retunedNode.next = node1;
                node1 = node1.next;
            } else {
                retunedNode.next = node2;
                node2 = node2.next;
            }
            retunedNode = retunedNode.next;
        }
        if (node1 != null) {
            retunedNode.next = node1;
        }
        if (node2 != null) {
            retunedNode.next = node2;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(10);
        node1.next = new ListNode(20);
        node1.next.next = new ListNode(30);
        node1.next.next.next = new ListNode(40);
        ListNode node2 = new ListNode(15);
        node2.next = new ListNode(25);
        node2.next.next = new ListNode(35);
        node2.next.next.next = new ListNode(45);
        ListNode ans = merge(node1, node2);
        display(ans);
    }
}