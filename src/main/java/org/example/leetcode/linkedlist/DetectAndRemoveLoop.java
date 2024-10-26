package org.example.leetcode.linkedlist;

public class DetectAndRemoveLoop {

    public void detectAndBreakCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                System.out.print("Loop Exist");
                breakLoop(head, slow, fast);
                break;
            }
        }
    }

    public void breakLoop(ListNode head, ListNode fast, ListNode slow) {
        slow = head;
        if (fast == slow) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
        } else {
            while (fast.next != slow.next) {
                fast = fast.next;
                slow = slow.next;
            }
            fast.next = null;
        }
    }

public void disPlay(ListNode head) {
    ListNode n = head;
    while (n != null) {
        System.out.print(n.data + "==>");
        n = n.next;
    }
}

public static void main(String[] args) {
    ListNode listNode = new ListNode(10);
    listNode.next = new ListNode(20);
    listNode.next.next = new ListNode(30);
    listNode.next.next.next = new ListNode(40);
    listNode.next.next.next.next = new ListNode(50);
    listNode.next.next.next.next.next = listNode.next;
    DetectAndRemoveLoop detectAndRemoveLoop = new DetectAndRemoveLoop();
    detectAndRemoveLoop.detectAndBreakCycle(listNode);
    detectAndRemoveLoop.disPlay(listNode);
}
}
