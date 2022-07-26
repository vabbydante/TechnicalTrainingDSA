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

        operations.insertAtEnd(new GenericNode<Integer>(55));

        operations.insertAtMid(new GenericNode<Integer>(150), 3);

        operations.print();
        operations.midPoint();
    }
}
