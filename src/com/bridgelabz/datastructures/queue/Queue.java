package com.bridgelabz.datastructures.queue;

import com.bridgelabz.datastructures.linkedList.DoublyLinkedList;


public class Queue<T extends Comparable<T>> {

    private DoublyLinkedList<T> list = new DoublyLinkedList<>();

    // Enqueue (Insert at end)
    public void enqueue(T data) {
        list.append(data);
    }
    // Dequeue (Remove from beginning)
    public T dequeue() {
        return list.pop();
    }
    // Peek (Return front element)
    public T peek() {
        return list.peek();
    }
    // Check if Queue is Empty
    public boolean isEmpty() {
        return list.isEmpty();
    }
    // Display Queue
    public void printQueue() {
        list.print();
    }
}