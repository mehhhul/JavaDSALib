package UtilPutal;

class StackUnderFlowException extends RuntimeException {
    public String toString() {
        return " stack underflow can't pop/peak";
    }
}

class StackOverFlowException extends RuntimeException {
    public String toString() {
        return " stack overflow can't push";
    }
}

public class MyStack<T> {
    private Object[] arr;
    private int top;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.arr = new Object[capacity];
        top = -1;
    }

    public void push(T item) {
        if (top == capacity - 1) {
            throw new StackOverFlowException();
        } else {
            arr[++top] = item;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new StackUnderFlowException();
        }
        return (T) arr[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new StackUnderFlowException();
        }
        return (T) arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i <= top; i++) {
            result += arr[i];
            if (i < top)
                result += ", ";
        }
        return result + "]";
    }
}
