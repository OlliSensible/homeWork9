package MyArrayList;

public class MyArrayList<T> {
    private Object[] elements;
    private int countSize;

    public MyArrayList() {
        elements = new Object[10];
        countSize = 0;
    }

    public void add(T value) {
        if (countSize == elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(elements, 0, newArray, 0, countSize);
            elements = newArray;
        }
        elements[countSize] = value;
        countSize++;
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < countSize - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[countSize - 1] = null;
        countSize--;
    }

    public void clear() {
        elements = new Object[10];
        countSize = 0;
    }

    public int size() {
        return countSize;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= countSize) {
            throw new IndexOutOfBoundsException();
        }
    }
}
