package com.vaibhav.coding.linkedlist;

class NodeLL {
    int data;
    NodeLL next;

    NodeLL(int data){
        this.data = data;
        this.next = null;
    }
}

public class PallindromeLinkedList {

    public boolean isPallindrome(NodeLL head){
        if(head == null || head.next == null){
            return true;
        }
        NodeLL slow = head;
        NodeLL fast = head;

        // find middle of the LL :
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the right half :
        slow.next = reverseList(slow.next);

        //move slow to the right half :
        slow = slow.next;

        // finally, check for left half and right half is equal or not :
        while (slow != null){
            if(head.data != slow.data){
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    // function for reversing the list and returning the node :
    NodeLL reverseList(NodeLL head){
        NodeLL previousNode = null;
        NodeLL nextNode;
        while(head != null){
            nextNode = head.next;
            head.next = previousNode;
            previousNode = head;
            head = nextNode;
        }
        return previousNode;
    }

    public static void main(String[] args) {
        NodeLL n1 = new NodeLL(10);
        NodeLL n2 = new NodeLL(20);
        NodeLL n3 = new NodeLL(30);
        NodeLL n4 = new NodeLL(20);
        NodeLL n5 = new NodeLL(10);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        PallindromeLinkedList opn = new PallindromeLinkedList();
        boolean result = opn.isPallindrome(n1);
        System.out.println(result);
    }
}
