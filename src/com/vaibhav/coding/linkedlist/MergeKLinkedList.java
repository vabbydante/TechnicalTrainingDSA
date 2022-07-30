package com.vaibhav.coding.linkedlist;

class NodeMerge{
    NodeMerge right;
    NodeMerge down;
    int data;

    NodeMerge(int data){
        this.data = data;
    }
}

public class MergeKLinkedList {

    NodeMerge start, tail;

    // here we will pass two heads of the linked list. to merge together
    // and return it.
    NodeMerge merge(NodeMerge start_1, NodeMerge start_2){
        if(start_1 == null) {
            return start_2;
        }
        if(start_2 == null){
            return start_1;
        }
        NodeMerge third, temp;
        if(start_1.data<start_2.data){
            third = start_1;
            start_1 = start_1.down;
        } else {
            third = start_2;
            start_2 = start_2.down;
        }

        temp = third;
        while(start_1 != null && start_2 != null){
            if(start_1.data < start_2.data){
                temp.down = start_1;
                temp = temp.down;
                start_1 = start_1.down;
            } else {
                temp.down = start_2;
                temp = temp.down;
                start_2 = start_2.down;
            }
        }

        // if start_1 != null then temp.down = start_1 else temp.down = start_2 :
        temp.down = start_1 != null ? start_1 : start_2;
        return third;
    }

    // now, jitne bhi k lists banengi, usse flatten karne ka function :
    void flatten(){
        if(start == null || start.right == null){
            print_1(start);
            return;
        }
        NodeMerge remaining = start.right;
        NodeMerge newHead = start;
        while(remaining != null){
            NodeMerge n2 = remaining;
            remaining = remaining.right;
            newHead = merge(newHead, n2);
        }
        print_1(newHead);
    }

    void print_1(NodeMerge start){
        NodeMerge temp = start;
        while(temp != null){
            System.out.print(temp.data + ", ");
            temp = temp.down;
        }
        System.out.println();
    }

//    function to add data towards down on the linked list :
    void add(int data){
        if(start == null){
            NodeMerge node = new NodeMerge(data);
            tail = start = node;
        } else {
            NodeMerge node = new NodeMerge(data);
            tail.down = node;
            tail = node;
        }
    }

    void print(){
        NodeMerge temp = start;
        while(temp != null) {
            if(temp.down != null){
                NodeMerge temp2 = temp;
                while(temp2 != null){
                    System.out.print(temp2.data + ", ");
                    temp2 = temp2.down;
                }
                System.out.println();
            }
            temp = temp.right;
        }
    }

    // function to add data to the top : see diagram in notebook :
    void topAdd(NodeMerge node){
        if(start == null){
            tail = start = node;
        } else {
            tail.right = node;
            tail = node;
        }
    }

    public static void main(String[] args) {
        MergeKLinkedList obj = new MergeKLinkedList();
        obj.add(5);
        obj.add(7);
        obj.add(9);
        obj.add(12);

        System.out.println("list 1 :");
        obj.print();

        MergeKLinkedList obj2 = new MergeKLinkedList();
        obj2.add(13);
        obj2.add(15);
        obj2.add(19);

        System.out.println("list 2 : ");
        obj2.print();

        MergeKLinkedList obj3 = new MergeKLinkedList();
        obj3.add(1);
        obj3.add(10);
        obj3.add(11);

        System.out.println("list 3 : ");
        obj3.print();
        System.out.println("________________________");

        MergeKLinkedList obj4 = new MergeKLinkedList();
        // now putting the heads(their references) in this topAdd function:
        obj4.topAdd(obj.start); //5
        obj4.topAdd(obj2.start); //13
        obj4.topAdd(obj3.start); //1

//        obj4.print();

        System.out.println("final list after flattening : ");
        obj4.flatten();
    }
}