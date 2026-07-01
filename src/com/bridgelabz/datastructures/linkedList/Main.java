package com.bridgelabz.datastructures.linkedList;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        // Initial List
        list.append(56);
        list.append(70);

        list.pop();

        list.popLast();

        if (list.search(30)) {
            System.out.println("Node with value 30 found.");
        } else {
            System.out.println("Node not found.");
        }

        System.out.println("Before Insertion:");
        list.printForward();

        // Insert 30 after 56
        list.insertAfter(56, 30);

        System.out.println("\nAfter Insertion:");
        list.printForward();

        System.out.println("\nBackward Traversal:");
        list.printBackward();

    }
}