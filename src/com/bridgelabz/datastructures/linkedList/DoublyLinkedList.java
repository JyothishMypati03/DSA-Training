package com.bridgelabz.datastructures.linkedList;

public class DoublyLinkedList<T> {

    private Node<T> head;

    // Append node at the end
    public void append(T data) {

        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert newData after afterData
    public void insertAfter(T afterData, T newData) {

        Node<T> temp = head;

        // Search for the node
        while (temp != null && !temp.data.equals(afterData)) {
            temp = temp.next;
        }

        // Data not found
        if (temp == null) {
            System.out.println(afterData + " not found.");
            return;
        }

        Node<T> newNode = new Node<>(newData);

        // Connect new node
        newNode.next = temp.next;
        newNode.prev = temp;

        // If next node exists, update its prev reference
        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        // Update current node's next
        temp.next = newNode;
    }

    public void pop() {

        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    // Delete last node
    public void popLast() {

        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }

        // If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }

        // Traverse to the last node
        Node<T> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        // Remove last node
        temp.prev.next = null;
    }

    // Print Forward
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

    // Print Backward
    public void printBackward() {

        if (head == null)
            return;

        Node<T> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

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