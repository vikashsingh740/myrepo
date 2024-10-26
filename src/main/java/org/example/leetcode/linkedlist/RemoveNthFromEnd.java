package org.example.leetcode.linkedlist;

class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode firstpointer = dummyNode;
        ListNode secondpointer = dummyNode;
        for(int i=0;i<n;i++){
            secondpointer = secondpointer.next;
        }
        while(secondpointer.next!=null){
            secondpointer = secondpointer.next;
            firstpointer = firstpointer.next;
        }
        firstpointer.next = firstpointer.next.next;
        return dummyNode.next;
    }

    public static void main(String[] args) {

    }
}