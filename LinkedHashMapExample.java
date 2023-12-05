import java.util.LinkedHashMap;

/**
 * This class provides an example of using a LinkedHashMap in Java.
 * LinkedHashMap is a collection that maintains the order of insertion and
 * allows for efficient
 * retrieval of values based on their associated keys.
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap with String keys and Integer values
        LinkedHashMap<String, Integer> evenNumber = new LinkedHashMap<>();

        // Adding key-value pairs to the LinkedHashMap
        evenNumber.put("two", 2);
        evenNumber.put("three", 3);
        evenNumber.put("four", 4);
        evenNumber.put("five", 5);

        // Displaying the elements in the original LinkedHashMap
        System.out.println("Original LinkedHashMap: " + evenNumber);

        // Creating a new LinkedHashMap with the elements of the original LinkedHashMap
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumber);
        numbers.put("six", 6);

        // Displaying the elements in the new LinkedHashMap after adding a new entry
        System.out.println("Updated LinkedHashMap: " + numbers);

        // Adding more entries to the new LinkedHashMap
        numbers.put("seven", 7);
        numbers.putIfAbsent("five", 5); // If absent, add the specified key-value pair

        // Displaying the final elements in the new LinkedHashMap
        System.out.println("Final LinkedHashMap: " + numbers);
    }
}
