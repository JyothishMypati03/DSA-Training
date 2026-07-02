package com.bridgelabz.datastructures.hashtable;

public class Main {

    public static void main(String[] args) {

        String sentence = "To be or not to be";

        String[] words = sentence.toLowerCase().split(" ");

        LinkedList<String, Integer> list = new LinkedList<>();

        for (String word : words) {

            Node<String, Integer> node = list.search(word);

            if (node == null) {
                list.add(word, 1);
            } else {
                node.setValue(node.getValue() + 1);
            }
        }

        System.out.println("Word Frequencies:");

        list.print();
    }
}