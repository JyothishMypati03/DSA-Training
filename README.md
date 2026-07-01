#  Delete the Last Node (Pop Last Operation) in Doubly Linked List

## Description

This project demonstrates how to delete the **last node (tail)** from a **Doubly Linked List** using Java Generics. After deleting the last node, the previous node becomes the new tail of the list.

## Objective

- Understand the Pop Last operation in a Doubly Linked List.
- Delete the last node from the list.
- Update the new tail node.
- Maintain both `prev` and `next` references correctly.

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
- Append nodes to the list
- Delete the last node (Pop Last)
- Forward traversal
- Backward traversal

## Sample Input

```java
list.append(56);
list.append(30);
list.append(70);

list.popLast();
```

## Output

```
Before Deleting Last Node:
56 <-> 30 <-> 70

After Deleting Last Node:
56 <-> 30

Backward Traversal:
30 <-> 56
