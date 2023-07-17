package MyStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<String>();

        // Check adding elements to the stack
        for (int i = 0; i < 15; i++) {
            stack.push("Element " + i);
        }

        // Check getting the size of the stack
        System.out.println("Stack size: " + stack.size());

        // Check getting the top element of the stack
        System.out.println("Top element of the stack: " + stack.peek());

        // Check removing and getting the top element of the stack
        Object removedElement = stack.pop();
        System.out.println("Removed element from the stack: " + removedElement);
        System.out.println("Stack size after removal: " + stack.size());
        System.out.println("New top element of the stack: " + stack.peek());

        // Check clearing the stack
        stack.clear();
        System.out.println("Stack size after clearing: " + stack.size());
    }
}
