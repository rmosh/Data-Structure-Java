import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * This class demonstrates the reversal of a Queue using a Stack.
 */
public class StringReverseWithQueue {

    public static void main(String[] args) {
        // Creating a Queue and adding elements
        Queue<String> queue = new ArrayDeque<String>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        // Displaying the original Queue
        System.out.println("Original Queue: " + queue);

        // Reversing the Queue using the reverse method
        reverse(queue);

        // Displaying the reversed Queue
        System.out.println("Reversed Queue: " + queue);
    }

    /**
     * Reverses the given Queue using a Stack.
     *
     * @param queue The Queue to be reversed.
     */
    public static void reverse(Queue<String> queue) {
        // Creating a Stack to temporarily store elements
        Stack<String> stack = new Stack<>();

        // Moving elements from the Queue to the Stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Moving elements from the Stack back to the Queue, reversing their order
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
