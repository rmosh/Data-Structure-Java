import java.util.SortedMap;
import java.util.TreeMap;

/**
 * This class provides an example of using a SortedMap in Java.
 * SortedMap is a Map that maintains its keys in ascending order, according to
 * the natural
 * ordering of keys or a specified comparator.
 */
public class SortedMapExample {
    public static void main(String[] args) {
        // Creating a SortedMap with String keys and Integer values using TreeMap
        SortedMap<String, Integer> numbers = new TreeMap<String, Integer>();

        // Adding key-value pairs to the SortedMap
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("five", 5);

        // Displaying the entire SortedMap
        System.out.println("SortedMap: " + numbers);

        // Displaying the first key in the SortedMap
        System.out.println("First key: " + numbers.firstKey());

        // Displaying the last key in the SortedMap
        System.out.println("Last key: " + numbers.lastKey());

        // Removing a specific key from the SortedMap and displaying the result
        System.out.println("Removed value associated with key 'one': " + numbers.remove("one"));

        // Displaying the SortedMap after removal
        System.out.println("SortedMap after removal: " + numbers);
    }
}
