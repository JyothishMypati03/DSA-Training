# UC8 - Insert a Node After a Given Node in Doubly Linked List

## Description

This project demonstrates how to insert a new node after a specific node in a Doubly Linked List using Java Generics. The linked list is first searched to locate the node with value **30**, and then a new node with value **40** is inserted immediately after it.

## Objective

- Understand insertion after a specific node.
- Search for a node using its value.
- Insert a new node while maintaining both `prev` and `next` references.
- Verify the implementation using JUnit test cases.

## Technologies Used

- Java
- Java Generics
- JUnit 5
- Object-Oriented Programming (OOP)

## Project Structure

```
src
└── com.bridgelabz.datastructures.doublylinkedlist
    ├── Node.java
    ├── DoublyLinkedList.java
    ├── DoublyLinkedListTest.java
    └── Main.java
```

## Features

- Generic Node implementation
- Append nodes
- Search a node by value
- Insert a node after a specified node
- Forward traversal
- Backward traversal
- JUnit test cases

## Sample Input

```java
list.append(56);
list.append(30);
list.append(70);

list.insertAfter(30, 40);
```

## Output

```
Before Insertion:
56 <-> 30 <-> 70

After Insertion:
56 <-> 30 <-> 40 <-> 70
```