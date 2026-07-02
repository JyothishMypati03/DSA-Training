package com.bridgelabz.datastructures.linkedList;

public class DoublyLinkedList<T extends Comparable<T>> {

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

    // Return first element
    public T peek() {

        if (head == null) {
            return null;
        }

        return head.data;
    }

    // Remove first element
    public T pop() {

        if (head == null) {
            return null;
        }

        T data = head.data;

        head = head.next;

        return data;
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

    // Check list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Search a node
    public boolean search(T key) {

        Node<T> temp = head;

        while (temp != null) {

            if (temp.data.equals(key)) {
                return true;
            }

            temp = temp.next;
        }


        return false;
    }

    // Delete a node
    public void delete(T key) {

        Node<T> temp = head;

        while (temp != null && !temp.data.equals(key)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node not found.");
            return;
        }

        // If deleting first node
        if (temp == head) {

            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            return;
        }

        // Update previous node
        temp.prev.next = temp.next;

        // Update next node
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    // Size of Linked List
    public int size() {

        int count = 0;

        Node<T> temp = head;

        while (temp != null) {

            count++;

            temp = temp.next;
        }

        return count;
    }
    // Insert in ascending order
    public void add(T data) {

        Node<T> newNode = new Node<>(data);

        // Empty list
        if (head == null) {
            head = newNode;
            return;
        }

        // Insert at beginning
        if (data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to find correct position
        Node<T> temp = head;

        while (temp.next != null &&
                data.compareTo(temp.next.data) > 0) {

            temp = temp.next;
        }

        // Insert node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display Linked List
    public void print() {

        Node<T> temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
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