package com.bridgelabz.datastructures.stack;
import com.bridgelabz.datastructures.linkedList.DoublyLinkedList;

public class Stack<T extends Comparable<T>> {

    private DoublyLinkedList<T> list = new DoublyLinkedList<>();

    // Push
    public void push(T data) {
        list.add(data);
    }

    // Peek
    public T peek() {
        return list.peek();
    }

    // Pop
    public T pop() {
        return list.pop();
    }

    // Check empty
    public boolean isEmpty() {
        return list.isEmpty();
    }


}
