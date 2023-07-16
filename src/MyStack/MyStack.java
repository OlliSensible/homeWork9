package MyStack;

import MyArrayList.MyArrayList;

public class MyStack {
    private MyArrayList list;

    public MyStack() {
        list = new MyArrayList();
    }

    public void push(Object value) {
        list.add(value);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public void clear() {
        list.clear();
    }

    public int size() {
        return list.size();
    }

    public Object peek() {
        if (list.size() == 0) {
            throw new IllegalStateException("Stack is empty.");
        }
        return list.get(list.size() - 1);
    }

    public Object pop() {
        if (list.size() == 0) {
            throw new IllegalStateException("Stack is empty.");
        }
        Object lastElement = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return lastElement;
    }
}
