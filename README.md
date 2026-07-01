# Insert a Node Between Two Nodes (Doubly Linked List)

## Description

This project demonstrates how to insert a new node between two existing nodes in a **Doubly Linked List** using Java Generics.

Initially, the linked list contains the nodes **56** and **70**. The node **30** is inserted between them, resulting in the sequence **56 ⇄ 30 ⇄ 70**.

## Objective

- Understand insertion in a Doubly Linked List.
- Insert a node between two existing nodes.
- Maintain both `prev` and `next` references.
- Traverse the list in both forward and backward directions.

## Technologies Used

- Java
- Java Generics
- Object-Oriented Programming (OOP)

## Project Structure

```
src
└── com.bridgelabz.datastructures.doublylinkedlist
    ├── Node.java
    ├── DoublyLinkedList.java
    └── Main.java
```

## Features

- Generic Node implementation
- Append nodes
- Insert a node after a specified node
- Forward traversal
- Backward traversal

## Sample Input

```java
list.append(56);
list.append(70);

list.insertAfter(56, 30);
```

## Output

```
Before Insertion:
56 <-> 70

After Insertion:
56 <-> 30 <-> 70

Backward Traversal:
70 <-> 30 <-> 56
