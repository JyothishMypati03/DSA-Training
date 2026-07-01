package com.bridgelabz.datastructures.linkedList;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.add(70);
        list.add(30);
        list.add(56);

        System.out.println("Forward Traversal:");
        list.printForward();

        System.out.println("Backward Traversal:");
        list.printBackward();
    }
}