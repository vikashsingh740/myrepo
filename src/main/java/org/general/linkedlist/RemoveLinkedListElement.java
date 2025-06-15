package org.general.linkedlist;

public class RemoveLinkedListElement {

    public static void display(ListNode node) {
        ListNode n = node;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static ListNode removeNodeWithValueVal(ListNode node, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode node1 = dummy;
        dummy.next = node;
        while (node1!=null && node1.next!=null){
            if(node1.next.data == val){
                node1.next = node1.next.next;
            }
            node1 = node1.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(6);
        node1.next.next.next = new ListNode(3);
        node1.next.next.next.next = new ListNode(4);
        node1.next.next.next.next.next = new ListNode(5);
        node1.next.next.next.next.next.next = new ListNode(6);
        display(node1);
        System.out.println();
        removeNodeWithValueVal(node1,6);
        display(node1);
    }
}
