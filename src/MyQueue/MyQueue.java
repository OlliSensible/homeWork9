package MyQueue;

import MyLinkedList.MyLinkedList;

public class MyQueue {
    private MyLinkedList list;

    public MyQueue() {
        list = new MyLinkedList();
    }

    public void add(Object value) {
        list.add(value);
    }

    public void clear() {
        list.clear();
    }

    public int size() {
        return list.size();
    }

    public Object peek() {
        if (list.size() == 0) {
            throw new IllegalStateException("Queue is empty.");
        }
        return list.get(0);
    }

    public Object poll() {
        if (list.size() == 0) {
            throw new IllegalStateException("Queue is empty.");
        }
        Object firstElement = list.get(0);
        list.remove(0);
        return firstElement;
    }
}
