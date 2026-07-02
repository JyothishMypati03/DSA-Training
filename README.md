# Create a Queue Using Linked List

## Description

This project demonstrates the implementation of a **Queue** using the existing **Linked List** implementation. The `enqueue()` operation internally calls the `append()` method of the `LinkedList` class to insert elements at the end of the list. The queue follows the **FIFO (First In, First Out)** principle.

## Objective

- Understand the Queue data structure.
- Reuse the existing Linked List implementation.
- Implement the Enqueue operation.
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
- Generic Queue implementation
- Enqueue operation
- Queue traversal
- FIFO (First In, First Out)

## Sample Input

```java
queue.enqueue(56);
queue.enqueue(30);
queue.enqueue(70);
```

## Output

```
Queue:
56 -> 30 -> 70
```