# JavaDSALib 📚

A Java library of core data structures built from scratch — no `java.util.*` used internally.

Built as a learning project to understand how data structures work under the hood.

---

## Data Structures

### 🥞 Stack
A **LIFO** (Last In, First Out) structure — like a stack of plates.

| Method | Description |
|---|---|
| `push(T item)` | Add item to top |
| `pop()` | Remove and return top item |
| `peek()` | See top item without removing |
| `isEmpty()` | Returns true if stack is empty |
| `size()` | Returns number of elements |

```java
MyStack<Integer> stack = new MyStack<>(5);
stack.push(10);
stack.push(20);
stack.push(30);
System.out.println(stack);      // [10, 20, 30]
System.out.println(stack.pop()); // 30
System.out.println(stack);      // [10, 20]
```

---

### 🚶 Queue
A **FIFO** (First In, First Out) structure — like a line of people.

| Method | Description |
|---|---|
| `enqueue(T item)` | Add item to rear |
| `dequeue()` | Remove and return front item |
| `peek()` | See front item without removing |
| `isEmpty()` | Returns true if queue is empty |
| `size()` | Returns number of elements |

```java
MyQueue<Integer> queue = new MyQueue<>(5);
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);
System.out.println(queue);          // [10, 20, 30]
System.out.println(queue.dequeue()); // 10
System.out.println(queue);          // [20, 30]
```

---

### 🔗 Linked List
A dynamic linear structure where each node points to the next.

| Method | Description |
|---|---|
| `add(T item)` | Add item at end |
| `remove(int index)` | Remove item at given index |
| `get(int index)` | Return item at given index |
| `isEmpty()` | Returns true if list is empty |
| `size()` | Returns number of elements |

```java
MyLinkedList<Integer> list = new MyLinkedList<>();
list.add(10);
list.add(20);
list.add(30);
System.out.println(list);         // [10, 20, 30]
System.out.println(list.get(1));  // 20
list.remove(1);
System.out.println(list);         // [10, 30]
```

---

### 🌳 Binary Search Tree
A tree where left child < parent < right child. Enables fast search.

| Method | Description |
|---|---|
| `insert(T item)` | Insert item in correct position |
| `search(T item)` | Returns true if item exists |
| `inOrder()` | Print all elements in sorted order |

```java
MyBST<Integer> bst = new MyBST<>();
bst.insert(50);
bst.insert(30);
bst.insert(70);
bst.insert(20);
bst.inOrder();                      // 20 30 50 70 (sorted!)
System.out.println(bst.search(30)); // true
System.out.println(bst.search(99)); // false
```

---

### 🗂️ HashMap
Stores key-value pairs with O(1) average access. Uses chaining for collision handling.

| Method | Description |
|---|---|
| `put(K key, V value)` | Add or update a key-value pair |
| `get(K key)` | Return value for given key |
| `remove(K key)` | Remove entry by key |

```java
MyHashMap<String, Integer> map = new MyHashMap<>(10);
map.put("age", 20);
map.put("year", 2026);
System.out.println(map.get("age")); // 20
map.remove("age");
System.out.println(map.get("age")); // null
```

---

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

## About
Made by Mehul Kaintura — B.Tech CSE student at DIT University Dehradun.
