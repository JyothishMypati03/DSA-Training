package com.bridgelabz.datastructures.hashtable;

public class LinkedList<K, V> {

    private Node<K, V> head;

    // Add key-value pair
    public void add(K key, V value) {

        Node<K, V> newNode = new Node<>(key, value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<K, V> temp = head;

        while (temp.getNext() != null) {
            temp = (Node<K, V>) temp.getNext();
        }

        temp.setNext(newNode);
    }

    // Search by key
    public Node<K, V> search(K key) {

        Node<K, V> temp = head;

        while (temp != null) {

            if (temp.getKey().equals(key)) {
                return temp;
            }

            temp = (Node<K, V>) temp.getNext();
        }

        return null;
    }

    // Display list
    public void print() {

        Node<K, V> temp = head;

        while (temp != null) {

            System.out.println(temp);

            temp = (Node<K, V>) temp.getNext();
        }
    }
}
