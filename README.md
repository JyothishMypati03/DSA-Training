# Hash Table UC2 - Find Frequency of Words Using Hash Table

## Description

This project demonstrates the implementation of a custom **Hash Table** using Java Generics. A paragraph is split into individual words, and the frequency of each word is stored as a **Key-Value pair**.

The Hash Table uses a custom **Linked List** to handle collisions through **Separate Chaining**.

## Objective

- Understand the Hash Table data structure.
- Implement a custom Hash Table using Java.
- Store words as keys and their frequencies as values.
- Handle collisions using Linked Lists.
- Count the frequency of words in a paragraph.

## Technologies Used

- Java
- Java Generics
- Object-Oriented Programming (OOP)

## Project Structure

```
src
└── com.bridgelabz.datastructures.hashtable
    ├── INode.java
    ├── MyMapNode.java
    ├── LinkedList.java
    ├── MyHashMap.java
    └── Main.java
```

## Features

- Custom Hash Table implementation
- Generic Key-Value Pair storage
- Hash Function using `hashCode()`
- Collision handling using Separate Chaining
- Word Frequency Counter

## Sample Input

```java
String sentence =
"Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
```

## Sample Output

```
paranoids : 1
are : 2
not : 1
paranoid : 3
because : 2
they : 2
but : 1
keep : 1
putting : 1
themselves : 1
deliberately : 1
into : 1
avoidable : 1
situations : 1
```

> **Note:** The output may appear in a different order because words are stored in different hash buckets.
