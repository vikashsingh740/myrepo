package org.example.leetcode.linkedlist;

public class GetIntersectionNode {

    public int findSize(ListNode head){
        ListNode n = head;
        int count = 0;
        while(n!=null){
           count++;
           n = n.next;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = findSize(headA);
        int sizeB = findSize(headB);
        while(sizeA > sizeB){
            sizeA--;
            headA = headA.next;
        }
        while(sizeA < sizeB){
            sizeB--;
            headB = headB.next;
        }

        while(headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    public static void main(String[] args) {

    }
}