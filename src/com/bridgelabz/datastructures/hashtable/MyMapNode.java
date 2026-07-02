package com.bridgelabz.datastructures.hashtable;

public class MyMapNode<K, V> implements INode<K> {

    private K key;
    private V value;
    private INode<K> next;

    // Constructor
    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    // Returns the key
    @Override
    public K getKey() {
        return key;
    }

    // Updates the key
    @Override
    public void setKey(K key) {
        this.key = key;
    }

    // Returns the value
    public V getValue() {
        return value;
    }

    // Updates the value
    public void setValue(V value) {
        this.value = value;
    }

    // Returns the next node
    @Override
    public INode<K> getNext() {
        return next;
    }

    // Updates the next node
    @Override
    public void setNext(INode<K> next) {
        this.next = next;
    }



    // Displays key-value pair
    @Override
    public String toString() {
        return key + " : " + value;
    }
}