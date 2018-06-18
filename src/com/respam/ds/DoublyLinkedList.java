package com.respam.ds;

/**
 * Created by S P Mahapatra on 18/06/2018.
 */
public class DoublyLinkedList {

    // Length of doubly linked list
    private int length;

    ListNode head, tail;

    // Default constructor
    public DoublyLinkedList(){
        length = 0;
    }

    public void insertAtBegin(ListNode node){
        if(head == null){
            head = node;
            tail = node;
            length++;
        }
        else {
            node.next = head;
            head.prev = node;
            head = node;
            length++;
        }

    }

    public void insertAtEnd(ListNode node){
        if(head == null){
            head = node;
            tail = node;
            length++;
        }
        else{
            tail.next = node;
            node.prev = tail;
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
            node.setPrev(temp);
            temp.next.setPrev(node);
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

    public void removeFromBegin(){
        head = head.next;
        head.prev = null;
        length--;
    }

    public void removeFromEnd(){
        tail = tail.prev;
        tail.next = null;
        length--;
    }

    public void removeFromPos(int pos){
        ListNode temp = head;
        if(pos > length){
            removeFromEnd();
        }

        else if(pos == 0 || pos < 0){
            removeFromBegin();
        }

        else{
            for(int i=1; i<pos-1; i++){
                temp = temp.getNext();
            }
            temp.setNext(temp.next.next);
            temp.next.setPrev(temp);
            length--;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dl1 = new DoublyLinkedList();
        dl1.insertAtBegin(new ListNode(1));
        dl1.displayList();
        dl1.insertAtEnd(new ListNode(2));
        dl1.displayList();
        dl1.insertAtEnd(new ListNode(4));
        dl1.displayList();
        dl1.insertAtPos(new ListNode(3), 3);
        dl1.displayList();
        dl1.insertAtBegin(new ListNode(0));
        dl1.displayList();
        dl1.removeFromBegin();
        dl1.displayList();
        dl1.removeFromEnd();
        dl1.displayList();
        dl1.removeFromPos(2);
        dl1.displayList();
    }
}
