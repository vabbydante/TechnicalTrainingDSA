package com.vaibhav.coding.linkedlist;

// here, we can use Java Generics to build a node which can accept any type of data types :
class GenericNode<T> {
    T data;
    GenericNode<T> next;

    GenericNode(T data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCRUD<T> {
    private GenericNode<T> start;

    void insertAtBeg(GenericNode<T> node){
        // if, linked list is empty : start me hi daal do.
        if(start == null) {
            start = node;
            return;
        }
        // aur agar khali nai hai to :
        node.next = start;
        start = node;
    }

    void insertAtEnd(GenericNode<T> node){
        // if linked list is empty : start me hi dal do :
        if(start == null){
            start = node;
            return;
        }
        // aur agar khali nai hai to :
        GenericNode<T> current = start;
        // traverse and update the current until the null is found :
        while(current.next != null){
            current = current.next;
        }
        // then finally update the last node, to point to the new node! :
        current.next = node;
    }

    void insertAtMid(GenericNode<T> node, int pos){
        // if linked list is empty : start me hi dal do :
        if(start == null){
            start = node;
            return;
        }
        if(pos == 0){
            node.next = start;
            start = node;
        }
        // aur agar khali nai hui to (us particular index me data bharne ke liye code):
        if(pos > 0){
            int i = 1;
            GenericNode<T> temp = start;
            while(i < pos){
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node; // iss line me dhyaan rakhna. 'node' ka matlab hamari new node ka address hi hota hai!!!
        }
    }

    void deleteAtMid(int pos){
        if(start == null){
            System.out.println("No nodes to delete!");
            return;
        }
        GenericNode<T> temp = null;
        if(pos == 0) {
            temp = start.next; // temp me temporarily store kara diye next node ka address.
            start = temp; // aur ab, ussi address ko start me store kr diye. to start hamara next node me agya.
            // to delete hua na ji? ha? good.
            return;
        }

        int i = 1;
        temp = start;
        while(i<pos){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    void midPoint(){
        // here, the approach is to complete the traversal and data finding part in one loop only.
        // here, we will be using slow, and fast variables approach.
        // if slow is taking 1 step, the fast will take 2 steps.
        GenericNode<T> slow;
        GenericNode<T> fast;
        if(start != null){
            fast = slow = start;
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("Mid point's data is : " + slow.data);
        }
    }

    void findKthFromEnd(int k){
        GenericNode<T> p;
        GenericNode<T> q;
        p = q = start;
        for (int i = 1; i<=k; i++){
            q = q.next;
        }
        while (q != null){
            p = p.next;
            q = q.next;
        }
        System.out.println(k + " element from end of the linked list is : " + p.data);
    }

    void removeKthFromEnd(int k){
        GenericNode<T> p;
        GenericNode<T> q;
        GenericNode<T> temp;

        p = q = start;
        for (int i = 1; i<=k+1; i++){
            q = q.next;
        }
        while(q != null){
            p = p.next;
            q = q.next;
        }
        temp = p.next;
        p.next = p.next.next;
        System.out.println(k + " is removed : " + temp.data);
    }

//    void findKthFromEnd(int n){
//        GenericNode<T> current = start;
//        GenericNode<T> temp = null;
//        int counter = 2;
//        while (current.next != null){
//            current = current.next;
//            counter++;
//        }
//        int kth = counter - n;
//        System.out.println(kth);
//    }

    void reverseIterate(){
        if(start == null){
            System.out.println("No elements!");
        }
        if(start.next == null){
            System.out.println("No elements to reverse!!");
        }
        GenericNode<T> currentNode = start;
        GenericNode<T> previousNode = null;
        while(currentNode != null){
            GenericNode<T> nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        start = previousNode;
    }

    void detectLoop(){
        GenericNode<T> slow;
        GenericNode<T> fast;

        slow = fast = start;
        if(start != null){
            while(fast != null & fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    System.out.println("Cycle is present!");
                    return;
                }
            }
            System.out.println("No cycle detected!!");
        }
    }

    void detectAndRemoveLoop(){
        GenericNode<T> slow;
        GenericNode<T> fast;

        slow = fast = start;
        if(start != null){
            while(fast != null & fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    System.out.println("Cycle is present!");
                    slow.next = null;
                    System.out.println("Loop removed!");
                }
            }
            System.out.println("No cycle detected!!");
        }
    }

    void print(){
        GenericNode<T> current = start;
        while(current != null){
            System.out.println(current.data + " " + current.next);
            current = current.next;
        }
    }

    public static void main(String[] args) {

        //  some example to input data to the node :
//        GenericNode<String> n1 = new GenericNode<>("Hello");
        LinkedListCRUD<Integer> operations = new LinkedListCRUD<>();
        operations.insertAtBeg(new GenericNode<Integer>(10));
        operations.insertAtBeg(new GenericNode<Integer>(20));
        operations.insertAtBeg(new GenericNode<Integer>(30));
        operations.insertAtBeg(new GenericNode<Integer>(40));
        operations.insertAtBeg(new GenericNode<Integer>(70));

        operations.print();

        operations.removeKthFromEnd(3);
    }
}
