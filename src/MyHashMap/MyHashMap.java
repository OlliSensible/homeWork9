package MyHashMap;

import MyLinkedList.MyLinkedList;

public class MyHashMap {
    private static final int DEFAULT_CAPACITY = 16;
    private MyLinkedList[] buckets;
    private int size;

    public MyHashMap() {
        buckets = new MyLinkedList[DEFAULT_CAPACITY];
        size = 0;
    }

    private int getBucketIndex(Object key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % buckets.length;
    }

    public void put(Object key, Object value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new MyLinkedList();
        }

        MyLinkedList bucket = buckets[index];
        for (int i = 0; i < bucket.size(); i++) {
            Node node = (Node) bucket.get(i);
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        bucket.add(new Node(key, value));
        size++;
    }

    public void remove(Object key) {
        int index = getBucketIndex(key);
        MyLinkedList bucket = buckets[index];
        if (bucket != null) {
            for (int i = 0; i < bucket.size(); i++) {
                Node node = (Node) bucket.get(i);
                if (node.key.equals(key)) {
                    bucket.remove(i);
                    size--;
                    return;
                }
            }
        }
    }

    public void clear() {
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != null) {
                buckets[i].clear();
            }
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {
        int index = getBucketIndex(key);
        MyLinkedList bucket = buckets[index];
        if (bucket != null) {
            for (int i = 0; i < bucket.size(); i++) {
                Node node = (Node) bucket.get(i);
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
        }
        return null;
    }

    private static class Node {
        private Object key;
        private Object value;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }
}
