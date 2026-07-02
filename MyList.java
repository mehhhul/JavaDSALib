package UtilPutal;

public interface MyList<T> {
    void add(T item);
    void remove(int index);
    T get(int index);
    boolean isEmpty();
    int size();
}
