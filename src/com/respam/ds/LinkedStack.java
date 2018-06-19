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
        ListNode temp = top;
        int popped = top.getData();
        top = top.getPrev();
        length--;
        System.out.println(popped + " has been popped...");
    }

    public int peek() throws EmptyStackException {
        if(top == null){
            throw new EmptyStackException();
        }
        return top.getData();
    }

    public int size(){
        return length;
    }

    public void display(){
        ListNode temp = top;
        System.out.print("TOP -->  ");
        for(int i=0; i<length; i++){
            System.out.print(temp.getData() + " ");
            temp = temp.prev;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        LinkedStack ls1 = new LinkedStack();
        ls1.push(5);
        ls1.push(10);
        ls1.push(15);
        ls1.display();
        ls1.pop();
        ls1.display();
        ls1.pop();
        ls1.display();
    }
}
