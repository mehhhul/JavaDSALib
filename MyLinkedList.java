package UtilPutal;

class MyIndexOutOfBoundsException extends RuntimeException {
    public String toString() {
        return "Given index is out of bounds";
    }
}

public class MyLinkedList<T> implements MyList<T> {
    private Node head;
    private int size;

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T item) {
        // add a new node
        Node ptr = new Node(item);
        if (head == null) {
            size++;
            head = ptr;
        } else {
            Node ptr2 = head;
            while (ptr2.next != null) {
                ptr2 = ptr2.next;
            }
            ptr2.next = ptr;
            size++;

        }
    }

    public void remove(int index) {
        // remove at given index
        if (index < 0 || index >= size) {
            throw new MyIndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
            size--;
        } else {
            Node ptr = head;
            int i = 0;
            while (i < index - 1) {
                i++;
                ptr = ptr.next;
            }
            ptr.next = ptr.next.next;
            size--;
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size)
            throw new MyIndexOutOfBoundsException();
        Node ptr = head;
        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }
        return (T) ptr.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public String toString() {
        if (size == 0)
            return "[]";
        String result = "[";

        Node ptr = head;
        for (int i = 0; i < size - 1; i++) {
            result += ptr.data + ", ";
            ptr = ptr.next;
        }
        result += ptr.data;
        return result + "]";
    }
}