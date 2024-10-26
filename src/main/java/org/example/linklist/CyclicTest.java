package org.example.linklist;

public class CyclicTest {

    public void disPlay(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "==>");
            n = n.next;
        }
    }

    public boolean isCyclic(Node head) {
      Node fast = head;
      Node slow = head;
      while (fast!=null && fast.next!=null){
          fast = fast.next.next;
          slow = slow.next;
          if (fast == slow){
              return true;
          }
      }
      return false;
    }

    public void breakCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        if (fast == slow){
            slow = head;
            if(slow!=fast){
                while (slow.next!=fast.next){
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
            }else {
                while (fast.next!=slow){
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2;
        CyclicTest cyclicTest = new CyclicTest();
        System.out.println(cyclicTest.isCyclic(node1));
        cyclicTest.breakCycle(node1);
        cyclicTest.disPlay(node1);
    }
}
