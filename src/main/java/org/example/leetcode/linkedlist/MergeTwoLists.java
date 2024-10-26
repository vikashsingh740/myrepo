package org.example.leetcode.linkedlist;

class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode returnedNode = new ListNode(-1);
        ListNode newHead = returnedNode;
        while(list1!=null && list2!=null){
            if(list1.data <= list2.data){
              returnedNode.next = list1;
              list1 = list1.next;
            }else{
              returnedNode.next = list2;
              list2 = list2.next;
            }
            returnedNode = returnedNode.next;
        }
        if(list1==null){
           returnedNode.next = list2;
        }
        if(list2==null){
            returnedNode.next = list1;
        }
        return  newHead.next;
    }
}