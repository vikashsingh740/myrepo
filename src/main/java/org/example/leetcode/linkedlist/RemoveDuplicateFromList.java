package org.example.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {

    public void disPlay(ListNode head) {
        ListNode n = head;
        while (n != null) {
            System.out.print(n.data + "==>");
            n = n.next;
        }
    }

    public ListNode removeDuplicate(ListNode head) {
        ListNode n1 = head;
        ListNode prev = null;
        List<Integer> list = new ArrayList<>();
        while (n1 != null) {
            if (list.contains(n1.data)){
                prev.next = n1.next;
                n1=prev.next;
            }else {
                list.add(n1.data);
                prev=n1;
                n1=n1.next;
            }
        }
        return head;
    }

    public ListNode removeDuplicate1(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        Set<Integer> set = new HashSet<>();
        while (current != null) {
            if (set.contains(current.data)){
               prev.next = current.next;
            }else {
                set.add(current.data);
                prev=current;
            }
            current=current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(10);
        listNode.next = new ListNode(30);
        listNode.next.next = new ListNode(40);
        listNode.next.next.next = new ListNode(20);
        listNode.next.next.next.next = new ListNode(10);
        listNode.next.next.next.next.next = new ListNode(50);
        listNode.next.next.next.next.next.next = new ListNode(30);
        RemoveDuplicateFromList removeDuplicateFromList = new RemoveDuplicateFromList();
        removeDuplicateFromList.disPlay(listNode);
        System.out.println("Remove duplicate");
        ListNode listNode1 = removeDuplicateFromList.removeDuplicate1(listNode);
        removeDuplicateFromList.disPlay(listNode1);
    }
}
