package com.bridgelabz.datastructures.hashtable;

public class LinkedList<K, V> {

    private MyMapNode<K, V> head;

    // Add Key-Value pair at end
    public void add(K key, V value) {

        MyMapNode<K, V> newNode = new MyMapNode<>(key, value);

        if (head == null) {
            head = newNode;
            return;
        }

        MyMapNode<K, V> temp = head;

        while (temp.getNext() != null) {
            temp = (MyMapNode<K, V>) temp.getNext();
        }

        temp.setNext(newNode);
    }

    // Search node using key
    public MyMapNode<K, V> search(K key) {

        MyMapNode<K, V> temp = head;

        while (temp != null) {

            if (temp.getKey().equals(key)) {
                return temp;
            }

            temp = (MyMapNode<K, V>) temp.getNext();
        }

        return null;
    }

    // Display Linked List
    public void print() {

        MyMapNode<K, V> temp = head;

        while (temp != null) {

            System.out.println(temp);

            temp = (MyMapNode<K, V>) temp.getNext();
        }
    }
    // Remove node using key
    public boolean remove(K key) {

        // List is empty
        if (head == null) {
            return false;
        }

        // Remove first node
        if (head.getKey().equals(key)) {
            head = (MyMapNode<K, V>) head.getNext();
            return true;
        }

        MyMapNode<K, V> temp = head;

        while (temp.getNext() != null) {

            MyMapNode<K, V> nextNode = (MyMapNode<K, V>) temp.getNext();

            if (nextNode.getKey().equals(key)) {

                temp.setNext(nextNode.getNext());

                return true;
            }

            temp = nextNode;
        }

        return false;
    }
}