package com.bridgelabz.datastructures.linkedList;

public class DoublyLinkedList<T> {

    private Node<T> head;

    // Append node at the end
    public void append(T data) {

        Node<T> newNode = new Node<>(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node<T> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        // Link last node with new node
        temp.next = newNode;
        newNode.prev = temp;
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

        if (head == null) {
            return;
        }

        Node<T> temp = head;

        // Go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backward
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