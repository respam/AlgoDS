package com.respam.ds;

/**
 * Created by S P Mahapatra on 20/06/2018.
 */
public class PairWiseLinkedListSwap {

    public void pairSwap(ListNode head, int length){
        ListNode temp = head;
        for(int i=0; i<length/2; i++){
            int a = temp.getData();
            int b = temp.next.getData();
            ListNode nextTemp = temp.next.next;
            temp.next.setData(a);
            temp.setData(b);
            temp = nextTemp;
        }
    }

    public static void main(String[] args) {
        PairWiseLinkedListSwap pws1 = new PairWiseLinkedListSwap();
        LinkedList l1 = new LinkedList();
        l1.insertAtBegin(new ListNode(10));
        l1.insertAtBegin(new ListNode(15));
        l1.insertAtBegin(new ListNode(13));
        l1.insertAtBegin(new ListNode(67));
        l1.insertAtBegin(new ListNode(28));
        l1.insertAtBegin(new ListNode(68));
        l1.insertAtBegin(new ListNode(92));
        l1.insertAtBegin(new ListNode(100));
        System.out.println("Original Linked List");
        l1.displayList();
        pws1.pairSwap(l1.getHead(), l1.getLength());
        System.out.println("Pair swapped Linked List");
        l1.displayList();
    }
}
