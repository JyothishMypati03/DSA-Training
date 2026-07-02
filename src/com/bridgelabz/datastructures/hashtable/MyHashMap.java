package com.bridgelabz.datastructures.hashtable;

@SuppressWarnings("unchecked")
public class MyHashMap<K, V> {

    private final int size = 10;

    private LinkedList<K, V>[] buckets;

    // Constructor
    public MyHashMap() {

        buckets = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Generate Bucket Index
    private int getBucketIndex(K key) {

        return Math.abs(key.hashCode()) % size;
    }

    // Add or Update Key-Value Pair
    public void add(K key, V value) {

        int index = getBucketIndex(key);

        LinkedList<K, V> bucket = buckets[index];

        MyMapNode<K, V> node = bucket.search(key);

        if (node == null) {

            bucket.add(key, value);

        } else {

            node.setValue(value);
        }
    }

    // Get Value using Key
    public V get(K key) {

        int index = getBucketIndex(key);

        LinkedList<K, V> bucket = buckets[index];

        MyMapNode<K, V> node = bucket.search(key);

        if (node != null) {
            return node.getValue();
        }

        return null;
    }

    // Check whether key exists
    public boolean contains(K key) {

        return get(key) != null;
    }

    // Display Hash Table
    public void print() {

        for (int i = 0; i < size; i++) {

            System.out.println("Bucket " + i + ":");

            buckets[i].print();

            System.out.println();
        }
    }
}
