package UtilPutal;

class QueueUnderFlowException extends RuntimeException {
    public String toString() {
        return "queue underflow can't dequeue/peek";
    }
}

class QueueOverFlowException extends RuntimeException {
    public String toString() {
        return "queue overflow can't enqueue";
    }
}

public class MyQueue<T> {
    private Object[] arr;
    private int front;
    private int rear;
    private int capacity;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.arr = new Object[capacity];
        rear = -1;
        front = 0;
    }

    public void enqueue(T item) {
        if (rear == capacity - 1) {
            throw new QueueOverFlowException();
        }
        arr[++rear] = item;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new QueueUnderFlowException();
        }
        return (T) arr[front++];
    }

    public T peek() {
        if (isEmpty()) {
            throw new QueueUnderFlowException();
        }
        return (T) arr[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public int size() {
        return rear - front + 1;
    }

    public String toString() {
        // print from front to rear
        String result = "[";
        for (int i = front; i <= rear; i++) {
            result += arr[i];
            if (i < rear)
                result += ", ";
        }
        return result + "]";
    }
}
