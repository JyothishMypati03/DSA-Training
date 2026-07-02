package com.bridgelabz.datastructures.queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.println("Queue:");

        queue.printQueue();
    }

}
