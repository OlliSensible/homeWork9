package MyQueue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<String>();

        // Check adding elements to the queue
        for (int i = 0; i < 15; i++) {
            queue.add("Element " + i);
        }

        // Check getting the size of the queue
        System.out.println("The size of the queue: " + queue.size());

        // Check getting the first element of the queue
        System.out.println("The first element of the queue: " + queue.peek());

        // Check removing and getting the first element of the queue
        Object removedElement = queue.poll();
        System.out.println("Removed element from the queue: " + removedElement);
        System.out.println("The size of the queue after removal: " + queue.size());
        System.out.println("New first element of the queue: " + queue.peek());

        // Check clearing the queue
        queue.clear();
        System.out.println("The size of the queue after clearing: " + queue.size());
    }
}
