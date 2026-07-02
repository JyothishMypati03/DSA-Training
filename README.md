# Create a Stack Using Linked List

## Description

This project demonstrates the implementation of a **Stack** using the existing **Linked List** implementation. The `push()` operation internally calls the `add()` method of the `LinkedList` class to insert elements at the beginning of the list, making the most recently added element the top of the stack.

## Objective

- Understand the Stack data structure.
- Reuse the existing Linked List implementation.
- Implement the Push operation.
- Understand the LIFO (Last In, First Out) principle.

## Technologies Used

- Java
- Java Generics
- Object-Oriented Programming (OOP)

## Project Structure

```
src
└── com.bridgelabz.datastructures
    ├── linkedlist
    │   ├── Node.java
    │   └── LinkedList.java
    │
    └── stack
        ├── Stack.java
        └── Main.java
```

## Features

- Reuses the existing Linked List
- Generic Stack implementation
- Push operation
- Stack traversal
- LIFO (Last In, First Out)

## Sample Input

```java
stack.push(70);
stack.push(30);
stack.push(56);
```

## Output

```
Stack:
56 -> 30 -> 70
```