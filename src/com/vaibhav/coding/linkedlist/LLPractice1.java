package com.vaibhav.coding.linkedlist;

class GenericNode1<T> {
    T data;
    GenericNode1<T> next;

    GenericNode1(T data){
        this.data = data;
        this.next =null;
    }
}

public class LLPractice1<T> {
    private GenericNode1<T> start;

    void insertAtBeg(GenericNode1<T> node){
        // if linked list is empty :
        if(start == null){
            start = node;
            return;
        }
        node.next = start;
        start = node;
    }

    void insertAtEnd(GenericNode1<T> node){
        // if linked list is empty :
        if(start == null){
            start = node;
            return;
        }
        GenericNode1<T> current = start;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }

    void insertAtMid(GenericNode1<T> node, int pos){
        // if linked list is empty :
        if(start == null){
            start = node;
            return;
        }
        // if the position is zero :
        if (pos == 0){
            node.next = null;
            start = node;
        }
        if (pos > 0){
            int i = 1;
            GenericNode1<T> temp = start;
            while(i<pos){
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    void deleteAtMid(int pos) {
        GenericNode1<T> temp = null;
        if(pos == 0){
            temp = start.next;
            start = temp; // nice code!
            return;
        }
        int i = 1;
        temp = start;
        while (i < pos){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    void midPoint(){
        GenericNode1<T> slow;
        GenericNode1<T> fast;
        if (start != null){
            fast = slow = start;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println("Mid point is : " + slow.data);
        }
    }

    void print(){
        GenericNode1<T> current = start;
        while(current != null){
            System.out.println(current.data + " " + current.next);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LLPractice1<String> operation = new LLPractice1<>();
        operation.insertAtBeg(new GenericNode1<String>("A"));
        operation.insertAtBeg(new GenericNode1<String>("B"));
        operation.insertAtBeg(new GenericNode1<String>("C"));
        operation.insertAtBeg(new GenericNode1<String>("D"));
        operation.insertAtBeg(new GenericNode1<String>("E"));

        operation.deleteAtMid(0);

        operation.insertAtMid(new GenericNode1<String>("New"), 1);
        operation.insertAtEnd(new GenericNode1<String>("Something"));

        operation.print();
    }
}
