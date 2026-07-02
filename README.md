# Queue Dequeue Elements from Queue

## Description

This project demonstrates the implementation of the **Dequeue** operation using the existing **Linked List** implementation. The `dequeue()` operation internally calls the `pop()` method of the `LinkedList` class to remove the first element from the queue. The queue follows the **FIFO (First In, First Out)** principle.

## Objective

- Understand the Dequeue operation.
- Reuse the existing Linked List implementation.
- Remove elements from the front of the queue.
- Understand the FIFO (First In, First Out) principle.

## Technologies Used

- Java
- Java Generics
- Object-Oriented Programming (OOP)

## Project Structure

```
src
└── com.bridgelabz.datastructures
    ├── Doublylinkedlist
    │   ├── Node.java
    │   └── LinkedList.java
    │
    └── queue
        ├── Queue.java
        └── Main.java
```

## Features

- Reuses the existing Linked List
- Enqueue operation
- Dequeue operation
- Queue traversal
- FIFO (First In, First Out)

## Sample Input

```java
queue.enqueue(56);
queue.enqueue(30);
queue.enqueue(70);

queue.dequeue();
```

## Output

```
Queue Before Dequeue:
56 -> 30 -> 70

Dequeued Element: 56

Queue After Dequeue:
30 -> 70
```
