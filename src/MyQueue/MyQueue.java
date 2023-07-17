package MyQueue;

import MyLinkedList.MyLinkedList;

public class MyQueue<T> {
    private MyLinkedList<T> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    public void add(T value) {
        list.add(value);
    }

    public void clear() {
        list.clear();
    }

    public int size() {
        return list.size();
    }

    public T peek() {
        if (list.size() == 0) {
            throw new IllegalStateException("Queue is empty.");
        }
        return list.get(0);
    }

    public T poll() {
        if (list.size() == 0) {
            throw new IllegalStateException("Queue is empty.");
        }
        T firstElement = list.get(0);
        list.remove(0);
        return firstElement;
    }
}
