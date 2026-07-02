package com.bridgelabz.datastructures.hashtable;


public interface INode<K> {

    // Get the key
    K getKey();

    // Set the key
    void setKey(K key);

    // Get the next node
    INode<K> getNext();

    // Set the next node
    void setNext(INode<K> next);
}
