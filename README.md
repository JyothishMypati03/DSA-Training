# Hash Table UC1 - Find Frequency of Words in a Sentence

## Description

This project demonstrates how to find the frequency of words in a sentence using a custom **Hash Table** implementation based on a **Linked List**. Each word is stored as a **key**, and its occurrence count is stored as the **value** using a custom `Node<K, V>` class.

## Objective

- Understand the concept of a Hash Table.
- Store data as Key-Value pairs.
- Count the frequency of words in a sentence.
- Use a Linked List to store Key-Value pairs.
- Search for an existing key and update its value.

## Technologies Used

- Java
- Java Generics
- Object-Oriented Programming (OOP)

## Project Structure

```
src
└── com.bridgelabz.datastructures.hashtable
    ├── INode.java
    ├── Node.java
    ├── LinkedList.java
    └── Main.java
```

## Features

- Generic Node implementation
- Key-Value pair storage
- Linked List implementation
- Search operation
- Word frequency counting

## Sample Input

```java
String sentence = "To be or not to be";
```

## Output

```
Word Frequencies:

to : 2
be : 2
or : 1
not : 1
