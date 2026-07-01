package com.bridgelabz.datastructures.linkedList;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Forward Traversal:");
        list.printForward();

        System.out.println("Backward Traversal:");
        list.printBackward();
    }
}