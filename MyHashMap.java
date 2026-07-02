package UtilPutal;

public class MyHashMap<K, V> {
    private Object[] buckets;
    private int capacity;

    private class Node {
        K key;
        V value;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    @SuppressWarnings("unchecked")
    public MyHashMap(int capacity) {
        // initialize capacity and buckets array
        this.capacity = capacity;
        this.buckets = new Object[capacity];
    }

    private int hash(K key) {
        // return a valid index
        return Math.abs(key.hashCode() % capacity);
    }

    public void put(K key, V value) {
        // add key-value pair
        // if key already exists, update its value
        int i = hash(key);
        if (buckets[i] == null)
            buckets[i] = new Node(key, value);
        else {
            Node ptr = (Node) buckets[i];
            while (ptr.next != null) {
                if (ptr.key.equals(key)) { // key found → update
                    ptr.value = value;
                    return;
                }
                ptr = ptr.next;
            }
            // also check last node
            if (ptr.key.equals(key)) {
                ptr.value = value;
                return;
            }
            ptr.next = new Node(key, value);
        }
    }

    public V get(K key) {
        // return value for given key
        // if key doesn't exist, return null
        int i = hash(key);
        if (buckets[i] == null)
            return null;
        else {
            Node ptr = (Node) buckets[i];
            while (ptr != null) {
                if (ptr.key.equals(key))
                    return ptr.value;
                ptr = ptr.next;
            }
        }
        return null;
    }

    public void remove(K key) {
        // remove the node with given key
        int i = hash(key);
        if (buckets[i] == null)
            return;
        if (((Node) buckets[i]).key.equals(key)) {
            buckets[i] = ((Node) buckets[i]).next;
            return;
        }
        Node ptr = (Node) buckets[i];
        while (ptr.next != null) {
            if (ptr.next.key.equals(key)) {
                ptr.next = ptr.next.next;
                return;
            }
            ptr = ptr.next;
        }
    }
}
