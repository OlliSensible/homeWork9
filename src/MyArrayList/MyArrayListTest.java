package MyArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList <String> list = new MyArrayList<String>();

        // Check adding elements + check if it can have more than 10 elements
        for (int i = 0; i < 15; i++) {
            list.add("Element " + i);
        }

        // Check getting the size of the list
        System.out.println("The size of the list: " + list.size());

        // Check getting elements by index
        System.out.println("Element 1: " + list.get(0));
        System.out.println("Element 6: " + list.get(6));
        System.out.println("Element 9: " + list.get(9));

        // Check removing an element
        list.remove(1);
        System.out.println("The size of the list after deletion: " + list.size());
        System.out.println("New element 2: " + list.get(1));

        // Check clearing the list
        list.clear();
        System.out.println("The size of the list after clearing: " + list.size());
    }
}
