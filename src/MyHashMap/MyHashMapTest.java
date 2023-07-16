package MyHashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        // Check adding key-value pairs
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        // Check getting values by key
        System.out.println("Value for key key1: " + map.get("key1"));
        System.out.println("Value for key key2: " + map.get("key2"));
        System.out.println("Value for key key3: " + map.get("key3"));

        // Check updating value by key
        map.put("key2", "newValue2");
        System.out.println("Updated value for key key2: " + map.get("key2"));

        // Check removing a pair by key
        map.remove("key1");
        System.out.println("Value for key key1 after removal: " + map.get("key1"));

        // Check getting the size of the map
        System.out.println("Size of the map: " + map.size());

        // Check clearing the map
        map.clear();
        System.out.println("Size of the map after clearing: " + map.size());
    }
}
