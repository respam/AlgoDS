package com.respam.ds;

import java.util.Hashtable;

public class CyclicOrNotLinkedList {

    public boolean checkCycle(ListNode head){

        int count = 1;
        Hashtable ht = new Hashtable();
        while(head.next!= null){
            if(ht.contains(head.toString())){
                return true;
            }
            ht.put(count, head.toString());
            count++;
            head = head.next;
        }
        return false;
    }

    public boolean floydAlgoCheckCycle(ListNode head){
        while(head.next != null){
            ListNode slow = head;
            ListNode fast = head.next.next; // check null pointer exception
            if(slow.toString().equals(fast.toString())){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        CyclicOrNotLinkedList con1 = new CyclicOrNotLinkedList();
        LinkedList ll1 = new LinkedList();
        CircularLinkedList cl1 = new CircularLinkedList();
        ll1.insertAtBegin(new ListNode(10));
        ll1.insertAtEnd(new ListNode(15));
        ll1.insertAtEnd(new ListNode(20));
        ll1.insertAtEnd(new ListNode(30));
        ll1.insertAtEnd(new ListNode(35));
        ll1.insertAtEnd(new ListNode(45));
        ll1.displayList();

        cl1.insertAtBegin(new ListNode(10));
        cl1.insertAtEnd(new ListNode(15));
        cl1.insertAtEnd(new ListNode(20));
        cl1.insertAtEnd(new ListNode(30));
        cl1.insertAtEnd(new ListNode(35));
        cl1.insertAtEnd(new ListNode(45));
        cl1.displayList();

        System.out.println("Loop in ll1: " + con1.checkCycle(ll1.getHead()));
        System.out.println("Loop in cl1: " + con1.checkCycle(cl1.getHead()));
        System.out.println("Loop in ll1 using Floyd Algorithm: " + con1.floydAlgoCheckCycle(ll1.getHead()));
        System.out.println("Loop in cl1 using Floyd Algorithm: " + con1.floydAlgoCheckCycle(cl1.getHead()));
    }
}
