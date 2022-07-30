package com.vaibhav.coding.linkedlist;

class NodeILL {
    int data;
    Node next;

    NodeILL(int data){
        this.data = data;
        this.next = null;
    }
}

public class CheckIntersectionLinkedList {
    public static NodeLL getIntersectionNode(NodeLL headA, NodeLL headB){
        if(headA.next == null || headB.next == null){
            return null;
        }

        NodeLL d1 = headA;
        NodeLL d2 = headB;

        while(d1 != d2){
//            if(d1 != null || d2 != null){
//                d1 = d1.next;
//                d2 = d2.next;
//            }
//            d1 = headB;
//            d2 = headA;
        }
            d1 = d1 == null? headB : d1.next;
            d2 = d2 == null? headA : d2.next;
        return d1;
    }

    public static void main(String[] args) {
        NodeLL n1 = new NodeLL(10);
        NodeLL n2 = new NodeLL(20);
        NodeLL n3 = new NodeLL(30);
        NodeLL n4 = new NodeLL(40);
        NodeLL n5 = new NodeLL(50);

        NodeLL m1 = new NodeLL(10);
        NodeLL m2 = new NodeLL(20);
        NodeLL m3 = new NodeLL(30);
        NodeLL m4 = new NodeLL(40);
        NodeLL m5 = new NodeLL(50);
        NodeLL m6 = new NodeLL(30);
        NodeLL m7 = new NodeLL(40);
        NodeLL m8 = new NodeLL(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        m1.next = m2;
        m2.next = m3;
        m3.next = m4;
        m4.next = m5;
        m5.next = m6;
        m6.next = m7;
        m7.next = m8;
        m8.next = null;

        NodeLL currentNode = n1;

// 		while(currentNode != null){
// 		    System.out.println(currentNode.data + " " + currentNode.next);
// 		    currentNode = currentNode.next;
// 		}

        NodeLL result = getIntersectionNode(n5, m8);
        System.out.println(result.data);
    }
}
