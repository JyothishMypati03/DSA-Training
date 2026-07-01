package com.bridgelabz.datastructures.linkedList;

public class DoublyLinkedList<T> {

    private Node<T> head;

    // Add node at the beginning
    public void add(T data) {

        Node<T> newNode = new Node<>(data);

        // If list is not empty
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        // Move head to new node
        head = newNode;
    }

    // Print from first to last
    public void printForward() {

        Node<T> temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" <-> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    // Print from last to first
    public void printBackward() {

        Node<T> temp = head;

        // Go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backwards
        while (temp != null) {

            System.out.print(temp.data);

            if (temp.prev != null) {
                System.out.print(" <-> ");
            }

            temp = temp.prev;
        }

        System.out.println();
    }
}