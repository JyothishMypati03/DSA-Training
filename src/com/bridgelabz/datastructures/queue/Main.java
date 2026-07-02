package com.bridgelabz.datastructures.queue;

public class Main {

    public static void main(String[] args) {


        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.println("Queue Before Dequeue:");
        queue.printQueue();

        System.out.println("\nDequeued Element: " + queue.dequeue());

        System.out.println("\nQueue After Dequeue:");
        queue.printQueue();
    }

}
