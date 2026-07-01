# Delete a Node and Find the Size of Doubly Linked List

## Description

This project demonstrates how to delete a specific node from a **Doubly Linked List** using Java Generics. The linked list is searched to find the node with value **40**, the node is deleted, and the total number of nodes in the linked list is displayed using the `size()` method.

## Objective

- Understand node deletion in a Doubly Linked List.
- Search for a node before deleting it.
- Delete the specified node while maintaining both `prev` and `next` references.
- Calculate the size of the linked list.
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
- Search node by value
- Delete a specified node
- Calculate linked list size
- Forward traversal
- JUnit test cases

## Sample Input

```java
list.append(56);
list.append(30);
list.append(40);
list.append(70);

list.delete(40);

System.out.println(list.size());
```

## Output

```
Before Deletion:
56 <-> 30 <-> 40 <-> 70

After Deletion:
56 <-> 30 <-> 70

Size of Linked List: 3
