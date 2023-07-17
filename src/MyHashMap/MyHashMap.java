package MyHashMap;

import MyLinkedList.MyLinkedList;

public class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private MyLinkedList<Entry<K, V>>[] buckets;
    private int size;

    public MyHashMap() {
        buckets = new MyLinkedList[DEFAULT_CAPACITY];
        size = 0;
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % buckets.length;
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new MyLinkedList<>();
        }

        MyLinkedList<Entry<K, V>> bucket = buckets[index];
        for (int i = 0; i < bucket.size(); i++) {
            Entry<K, V> entry = bucket.get(i);
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
        size++;

        if (size == buckets.length) {
            resizeBuckets();
        }
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        MyLinkedList<Entry<K, V>> bucket = buckets[index];
        if (bucket != null) {
            for (int i = 0; i < bucket.size(); i++) {
                Entry<K, V> entry = bucket.get(i);
                if (entry.key.equals(key)) {
                    bucket.remove(i);
                    size--;
                    return;
                }
            }
        }
    }

    public void clear() {
        buckets = new MyLinkedList[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        MyLinkedList<Entry<K, V>> bucket = buckets[index];
        if (bucket != null) {
            for (int i = 0; i < bucket.size(); i++) {
                Entry<K, V> entry = bucket.get(i);
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    private void resizeBuckets() {
        int newCapacity = buckets.length * 2;
        MyLinkedList<Entry<K, V>>[] newBuckets = new MyLinkedList[newCapacity];

        for (MyLinkedList<Entry<K, V>> bucket : buckets) {
            if (bucket != null) {
                for (int i = 0; i < bucket.size(); i++) {
                    Entry<K, V> entry = bucket.get(i);
                    int newIndex = getBucketIndex(entry.key);

                    if (newBuckets[newIndex] == null) {
                        newBuckets[newIndex] = new MyLinkedList<>();
                    }
                    newBuckets[newIndex].add(entry);
                }
            }
        }

        buckets = newBuckets;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
