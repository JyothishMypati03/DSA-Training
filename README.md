# Hash Table UC3 - Remove a Word from Hash Table

## Description

This project demonstrates how to remove a specific word from a custom **Hash Table** implemented using Java Generics. The Hash Table stores words as **Key-Value pairs**, where the key is the word and the value is its frequency. The word **"avoidable"** is removed from the Hash Table after counting the word frequencies.

## Objective

- Understand the remove operation in a Hash Table.
- Search for a key before deleting it.
- Remove a Key-Value pair from the appropriate bucket.
- Handle collisions using Linked Lists.

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
- Generic Key-Value pair storage
- Hash Function using `hashCode()`
- Collision handling using Separate Chaining
- Remove operation
- Word frequency counting

## Sample Input

```java
String sentence =
"Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

hashMap.remove("avoidable");
```

## Output

### Before Removing

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

### After Removing

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
situations : 1
```

## Concepts Covered

- Hash Table
- Hash Function
- Bucket
- Separate Chaining
- Linked List
- Key-Value Pair
- Remove Operation
- Java Generics

## Learning Outcome

After completing this project, you will be able to:

- Implement the remove operation in a custom Hash Table.
- Delete a Key-Value pair from the correct bucket.
- Handle collisions using Linked Lists.
- Understand how deletion works in a Hash Table.
- Build a complete custom Hash Table using Java.

## Author

**Jyothish Mypati**