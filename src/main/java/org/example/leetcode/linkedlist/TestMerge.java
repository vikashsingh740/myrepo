package org.example.leetcode.linkedlist;

import org.example.linklist.Node;

public class TestMerge {
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode returnedNode = new ListNode(-1);
        ListNode headNode = returnedNode;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                returnedNode.next = l1;
                l1 = l1.next;
            } else {
                returnedNode.next = l2;
                l2 = l2.next;
            }
            returnedNode = returnedNode.next;
        }
        if (l1 != null) {
            returnedNode.next = l1;
        }
        if (l2 != null) {
            returnedNode.next = l2;
        }
        return headNode.next;
    }

    public void disPlay(ListNode head) {
        ListNode n = head;
        while (n != null) {
            System.out.print(n.data + "==>");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(10);
        listNode1.next = new ListNode(30);
        listNode1.next.next = new ListNode(50);
        listNode1.next.next.next = new ListNode(70);

        ListNode listNode2 = new ListNode(20);
        listNode2.next = new ListNode(40);
        listNode2.next.next = new ListNode(60);
        listNode2.next.next.next = new ListNode(80);
        listNode2.next.next.next.next = new ListNode(90);
        TestMerge testMerge = new TestMerge();
        ListNode mergedListNode = testMerge.merge(listNode1,listNode2);
        testMerge.disPlay(mergedListNode);
    }
}
