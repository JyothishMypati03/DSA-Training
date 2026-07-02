package com.bridgelabz.datastructures.queue;

import com.bridgelabz.datastructures.linkedList.DoublyLinkedList;


public class Queue<T extends Comparable<T>> {

    private DoublyLinkedList<T> list = new DoublyLinkedList<>();

    // Enqueue (Insert at end)
    public void enqueue(T data) {
        list.append(data);
    }

    // Display Queue
    public void printQueue() {
        list.print();
    }
}