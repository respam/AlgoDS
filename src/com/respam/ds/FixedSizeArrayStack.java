package com.respam.ds;

/**
 * Created by S P Mahapatra on 19/06/2018.
 */
public class FixedSizeArrayStack {
    // Legth of the array used to implement stack
    protected int capacity;

    // Default array capacity
    public static final int CAPACITY = 16; // power of 2

    // Array used to implement the stack
    protected int[] stackRep;

    // Index of the top element of the stack in the array
    protected int top = -1;

    // Initializes the stack to use an array of default length
    public FixedSizeArrayStack(){
        stackRep = new int[CAPACITY];
    }

    // Initialises the stack to use an array of given length
    public FixedSizeArrayStack(int cap){
        capacity = cap;
        stackRep = new int[capacity];
    }

    // Returns the number of elements in the stack
    public int size(){
        return top + 1;
    }

    // Checks whether the stack is empty
    public boolean isEmpty(){
        return (top < 0);
    }

    // insert element at the top of the stack
    public void push(int data) throws Exception{
        if(size() == capacity || size() == CAPACITY)
            throw new Exception("Stack is Full");
        stackRep[++top] = data;
    }

    // return the top element of the stack
    public int top() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is Empty");
        return stackRep[top];
    }

    // Pop the top element from stack
    public void pop() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is Empty");
        int data = stackRep[top];
        stackRep[top--] = Integer.MIN_VALUE; // Dereference stackrep[top] for garbage collection
        System.out.println(data + " has been popped");
    }

    // Display the elements in stack
    public void display(){
        System.out.print("TOP ---> ");
        for(int i=top; i>=0; i--){
            System.out.print(stackRep[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) throws Exception {
        FixedSizeArrayStack fsas1 = new FixedSizeArrayStack(20);
        fsas1.push(24);
        fsas1.push(30);
        fsas1.push(45);
        fsas1.display();
        fsas1.pop();
        fsas1.display();
        System.out.println(fsas1.top());;
    }
}
