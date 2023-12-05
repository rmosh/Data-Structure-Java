import java.util.HashMap;
import java.util.Map;

/**
 * This class provides an example of using a HashMap in Java with additional
 * operations.
 * HashMap is a collection that stores key-value pairs and allows for efficient
 * retrieval
 * of values based on their associated keys.
 */
public class HashMapExample {

    public static void main(String[] args) {
        // Creating a HashMap with Integer keys and String values
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put(1, "moshtaq");
        map.put(2, "Olek");
        map.put(3, "Martines");

        // Iterating through the entries in the HashMap and displaying key-value pairs
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }

        // Retrieving the value associated with a specific key
        System.out.println("Value associated with key 1: " + map.get(1));

        // Displaying the set of keys, values, and entries in the HashMap
        System.out.println("Set of keys: " + map.keySet());
        System.out.println("Collection of values: " + map.values());
        System.out.println("Set of key-value entries: " + map.entrySet());

        // Clearing all entries in the HashMap
        map.clear();
        System.out.println("HashMap after clearing: " + map);
    }
}
