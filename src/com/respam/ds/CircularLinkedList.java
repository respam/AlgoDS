package com.respam.ds;

/**
 * Created by S P Mahapatra on 18/06/2018.
 */
public class CircularLinkedList {
    private int length;
    ListNode head, tail;

    // Constructor to initiate the list
    public CircularLinkedList(){
        head = null;
        length = 0;
    }

    public void insertAtBegin(ListNode node){
        if(head == null){
            head = node;
            tail = node;
            head.next = head;
            tail.next = head; // Check if required since both 'head' and 'tail' point to same node
            length++;
        }
        else{
            node.next = head;
//            TODO Check with Jagrity if below is required if I just assign node to head.
            tail.next = node; // Understand object name assignments in heap
            head = node;
            length++;
        }
    }

    public void insertAtEnd(ListNode node){
        if(head == null){
            insertAtBegin(node);
        }
        else{
            node.next = head;
            tail.next = node;
            tail = node;
            length++;
        }
    }

    public void insertAtPos(ListNode node, int pos){
        ListNode temp = head;
        if(pos == 0 || pos < 0){
            insertAtBegin(node);
        }
        else if(pos > length){
            insertAtEnd(node);
        }
        else{
            for(int i=1; i<pos-1; i++){
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
            length++;
        }
    }

    public void displayList(){
        if(head == null){
            System.out.println("List is empty...");
        }
        else{
            ListNode displayTemp = head;
            for(int i=0; i<length; i++){
                System.out.print(displayTemp.getData() + " ");
                displayTemp = displayTemp.next;
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        CircularLinkedList cll1 = new CircularLinkedList();
        cll1.insertAtBegin(new ListNode(1));
        cll1.displayList();
        cll1.insertAtBegin(new ListNode(0));
        cll1.displayList();
        cll1.insertAtEnd(new ListNode(3));
        cll1.displayList();
        cll1.insertAtEnd(new ListNode(4));
        cll1.displayList();
        cll1.insertAtPos(new ListNode(5), 3);
        cll1.displayList();
        System.out.println(cll1.tail.getData());
        System.out.println(cll1.tail.next.getData());
    }
}
