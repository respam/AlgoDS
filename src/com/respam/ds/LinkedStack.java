package com.respam.ds;

import java.util.EmptyStackException;

public class LinkedStack {

    private ListNode top;
    private int length;

    public LinkedStack(){
        top = null;
        length = 0;
    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.setPrev(top);
        top = temp;
        length++;
    }

    public void pop() throws EmptyStackException {
        if(top == null){
            throw new EmptyStackException();
        }
        else{
            ListNode temp = top;
            top = top.getPrev();
            length--;
        }
    }
}
