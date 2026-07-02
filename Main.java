package UtilPutal;

public class Main {
    public static void main(String[] args) {
        // MyStack
        MyStack<Integer> stack = new MyStack<>(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        // MyQueue
        MyQueue<Integer> queue = new MyQueue<>(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);

        // MyLinkedList
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);

        // MyBST
        MyBST<Integer> bst = new MyBST<>();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.inOrder();
        System.out.println(bst.search(30));
        System.out.println(bst.search(99));

        // MyHashMap
        MyHashMap<String, Integer> map = new MyHashMap<>(10);
        map.put("age", 20);
        map.put("year", 2026);
        System.out.println(map.get("age"));
        map.remove("age");
        System.out.println(map.get("age"));
    }
}



