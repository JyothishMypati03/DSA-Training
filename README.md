# Peek and Pop Elements from Stack

## Description

This project demonstrates how to perform **Peek** and **Pop** operations on a **Stack** using the existing **Linked List** implementation. The stack follows the **Last In, First Out (LIFO)** principle. The `peek()` operation returns the top element without removing it, while the `pop()` operation removes the top element. The elements are removed until the stack becomes empty.

## Objective

- Understand the Peek operation.
- Understand the Pop operation.
- Reuse the existing Linked List implementation.
- Remove elements from the stack until it becomes empty.

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
- Push operation
- Peek operation
- Pop operation
- Check if stack is empty
- LIFO (Last In, First Out)

## Sample Input

```java
stack.push(70);
stack.push(30);
stack.push(56);

stack.peek();

while (!stack.isEmpty()) {
    System.out.println(stack.pop());
}
```

## Output

```
Top Element: 56

56
30
70

Stack is Empty
