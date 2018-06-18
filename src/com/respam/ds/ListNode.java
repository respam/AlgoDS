package com.respam.ds;

/**
 * Created by S P Mahapatra on 18/06/2018.
 */
public class ListNode {
    public int data;
    ListNode next;
    ListNode prev;

    // Creates an empty node
    public ListNode(){
        next = null;
        data = Integer.MIN_VALUE;
        prev = null;
    }

    // Creates a node storing specific data
    public ListNode(int data){
        this.data = data;
    }

    public void setData(int elem){
        data = elem;
    }

    public int getData(){
        return data;
    }

    public void setNext(ListNode node){
        next = node;
    }

    public ListNode getNext(){
        return next;
    }

    public void setPrev(ListNode node){
        prev = node;
    }

    public ListNode getPrev(){
        return prev;
    }
}
