# Delete the First Node (Pop Operation) in Doubly Linked List

## Description

This project demonstrates how to delete the **first node (Head)** from a **Doubly Linked List** using Java Generics. After deleting the first node, the next node becomes the new head of the list.

## Objective

- Understand the Pop operation in a Doubly Linked List.
- Delete the first node from the list.
- Update the Head node.
- Maintain the `prev` and `next` references correctly.

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
- Delete the first node (Pop)
- Forward traversal
- Backward traversal

## Sample Input

```java
list.append(56);
list.append(30);
list.append(70);

list.pop();
```

## Output

```
Before Deleting First Node:
56 <-> 30 <-> 70

After Deleting First Node:
30 <-> 70

Backward Traversal:
70 <-> 30
