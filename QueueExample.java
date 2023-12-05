import java.util.PriorityQueue;

/**
 * This class provides an example of using a PriorityQueue in Java.
 * PriorityQueue is a special kind of queue where elements are processed based
 * on their natural order
 * or according to a specified comparator.
 */
public class QueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue of integers
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Displaying the initial size of the PriorityQueue
        System.out.println("Initial size of the PriorityQueue: " + queue.size());

        // Adding elements to the PriorityQueue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        // Displaying the elements in the PriorityQueue and its current size
        System.out.println("PriorityQueue elements: " + queue);
        System.out.println("Current size of the PriorityQueue: " + queue.size());

        // Peeking at the element with the highest priority without removing it
        System.out.println("Peeked element (highest priority): " + queue.peek());

        // Polling (removing) the element with the highest priority
        System.out.println("Polled element (removed highest priority): " + queue.poll());

        // Displaying the elements in the PriorityQueue after polling and its current
        // size
        System.out.println("PriorityQueue elements after polling: " + queue);
        System.out.println("Current size of the PriorityQueue: " + queue.size());
    }
}
