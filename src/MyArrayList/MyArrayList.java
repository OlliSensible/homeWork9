package MyArrayList;

public class MyArrayList {
    private Object[] elements;
    private int countSize;

    public MyArrayList() {
        elements = new Object[10];
        countSize = 0;
    }

    public void  add(Object value){
        if (countSize == elements.length){
            int newCapacity = elements.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(elements, 0, newArray, 0, countSize);
            elements = newArray;
        }
        elements[countSize] = value;
        countSize++;
    }

    public void remove(int index) {
        if (index < 0 || index >= countSize) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < countSize - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[countSize - 1] = null;
        countSize--;
    }
    public void clear() {
        for (int i = 0; i < countSize; i++) {
            elements[i] = null;
        }
        countSize = 0;
    }
    public int size() {
        return countSize;
    }
    public Object get(int index) {
        if (index < 0 || index >= countSize) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }
}

