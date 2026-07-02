package com.bridgelabz.datastructures.hashtable;

public class Main {

    public static void main(String[] args) {

        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] words = sentence.toLowerCase().split(" ");

        MyHashMap<String, Integer> hashMap = new MyHashMap<>();

        // Count word frequencies
        for (String word : words) {

            Integer count = hashMap.get(word);

            if (count == null) {
                hashMap.add(word, 1);
            } else {
                hashMap.add(word, count + 1);
            }
        }

        System.out.println("Before Removing:\n");

        hashMap.print();


    }
}