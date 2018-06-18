package com.respam.ds;

/**
 * Created by S P Mahapatra on 18/06/2018.
 */
public class LinkedList {

    // Length of Linked List
    private int length = 0;

    // Default constructor
    public LinkedList(){
        length = 0;
    }

    ListNode head;

    public void insertAtBegin(ListNode node){
        if(head != null){
            node.setNext(head);
            head = node;
            length++;
        }
        else{
            head = node;
            length++;
        }
    }

    public void insertAtEnd(ListNode node){
        if(head != null){
            ListNode temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(node);
            length++;
        }
        else{
            head = node;
            length++;
        }
    }

    public ListNode getHead(){
        return head;
    }

    public void insertAtPos(ListNode node, int pos){
        ListNode temp = head;

        if(pos > length){
            insertAtEnd(node);
        }

        else if(pos == 0 || pos < 0){
            insertAtBegin(node);
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

    public int getLength(){
        return length;
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
        length--;
    }

    public void removeFromEnd(){
        ListNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
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
            length--;
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.insertAtBegin(new ListNode(1));
        l1.displayList();
        l1.insertAtEnd(new ListNode(2));
        l1.displayList();
        l1.insertAtEnd(new ListNode(4));
        l1.displayList();
        l1.insertAtPos(new ListNode(3), 3);
        l1.displayList();
        l1.insertAtBegin(new ListNode(0));
        l1.displayList();
        l1.removeFromBegin();
        l1.displayList();
        l1.removeFromEnd();
        l1.displayList();

        l2.insertAtBegin(new ListNode(10));
        l2.displayList();
        l2.insertAtEnd(new ListNode(15));
        l2.displayList();
        l2.insertAtEnd(new ListNode(20));
        l2.displayList();
        l2.insertAtEnd(new ListNode(25));
        l2.displayList();
        l2.removeFromPos(3);
        l2.displayList();
        System.out.println(l1.getLength());
        System.out.println(l2.getLength());
    }

}
