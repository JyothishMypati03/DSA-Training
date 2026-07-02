package com.bridgelabz.datastructures.stack;
import com.bridgelabz.datastructures.linkedList.DoublyLinkedList;

public class Stack<T extends Comparable<T>> {

    private DoublyLinkedList<T> list = new DoublyLinkedList<>();

    public void push(T data) {
        list.add(data);
    }

    public void printStack() {
        list.print();
    }


}
