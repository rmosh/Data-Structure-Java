
/**
 * This class demonstrates the usage of the Stack class in Java.
 * A Stack represents a last-in, first-out (LIFO) data structure where elements
 * are added and removed from the same end, commonly referred to as the "top" of the stack.
 */
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // Creating a stack of integers
        Stack<Integer> stack = new Stack<Integer>();

        // Displaying the initial size of the stack
        System.out.println("Initial size of the stack: " + stack.size());

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Displaying the elements in the stack and its current size
        System.out.println("Stack elements: " + stack);
        System.out.println("Current size of the stack: " + stack.size());

        // Peeking at the top element of the stack without removing it
        System.out.println("Peeked element: " + stack.peek());

        // Popping (removing) the top element of the stack
        System.out.println("Popped element: " + stack.pop());

        // Displaying the elements in the stack after popping and its current size
        System.out.println("Stack elements after popping: " + stack);
        System.out.println("Current size of the stack: " + stack.size());

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());
    }
}
