# Doubly Linked List Using Java Generics

## Description

This project demonstrates the implementation of a **Doubly Linked List** from scratch using **Java Generics**. Each node stores data along with references to both the previous and next nodes, allowing traversal in both forward and backward directions.

## Objective

- Understand the working of a Doubly Linked List.
- Implement a custom Node class using Java Generics.
- Append nodes at the end of the list.
- Traverse the list in both forward and backward directions.

## Project Structure

```
src
└── com.bridgelabz.datastructures.doublylinkedlist
    ├── Node.java
    ├── DoublyLinkedList.java
    └── Main.java
```

## Technologies Used

- Java
- Java Generics
- Object-Oriented Programming (OOP)

## Features

- Generic Node implementation
- Append elements to the end of the list
- Forward traversal
- Backward traversal
- Custom Doubly Linked List implementation

## Sample Input

```java
list.append(56);
list.append(30);
list.append(70);
```

## Output

```
Forward Traversal:
56 <-> 30 <-> 70

Backward Traversal:
70 <-> 30 <-> 56
```