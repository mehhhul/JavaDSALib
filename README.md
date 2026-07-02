# JavaDSALib

A Java library of core data structures built from scratch, without using `java.util.*`.

Built as a learning project to deeply understand how data structures work internally.

## Data Structures Implemented

| Structure | File | Description |
|---|---|---|
| Stack | `MyStack.java` | Array-based stack with push, pop, peek |
| Queue | `MyQueue.java` | Array-based queue with enqueue, dequeue |
| Linked List | `MyLinkedList.java` | Singly linked list with add, remove, get |
| Binary Search Tree | `MyBST.java` | BST with insert, search, inorder traversal |
| HashMap | `MyHashMap.java` | Hash map with chaining for collision handling |

## Key Concepts Used

- Generics (`<T>`, `<K, V>`)
- Interfaces (`MyList<T>`)
- Custom Exceptions
- Recursion (BST)
- Hashing & Collision Handling

## How to Run

```bash
javac UtilPutal/*.java
java UtilPutal.Main
```

## Sample Output

```
[10, 20, 30]   ← Stack
30             ← Popped
[10, 20, 30]   ← Queue
10             ← Dequeued
[10, 20, 30]   ← LinkedList
20 30 50 70    ← BST Inorder (sorted)
20             ← HashMap get
null           ← After remove
```

## About

Made by Mehul Kaintura — B.Tech CSE student at DIT University Dehradun.
