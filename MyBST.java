package UtilPutal;

public class MyBST<T extends Comparable<T>> {
    private Node root;

    private class Node {
        T data;
        Node left;
        Node right;

        Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(T item) {
        root = insert(root, item);
    }

    private Node insert(Node root, T item) {
        if (root == null)
            return new Node(item);
        if (item.compareTo(root.data) > 0)
            root.right = insert(root.right, item);
        else if (item.compareTo(root.data) < 0)
            root.left = insert(root.left, item);
        return root;
    }

    public boolean search(T item) {
        return search(root, item);
    }

    private boolean search(Node root, T item) {
        if (root == null)
            return false;
        if (item.compareTo(root.data) == 0)
            return true;
        if (item.compareTo(root.data) > 0)
            return search(root.right, item);
        else
            return search(root.left, item);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
}
