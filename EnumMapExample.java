import java.util.EnumMap;

/**
 * This class provides an example of using an EnumMap in Java.
 * EnumMap is a specialized Map implementation designed for use with enum keys.
 * It efficiently stores and retrieves values based on enum keys and maintains
 * the order
 * of the keys as they are declared in the enum type.
 */
enum Size {
    small, medium, large
}

public class EnumMapExample {
    public static void main(String[] args) {
        // Creating an EnumMap with Size enum keys and Integer values
        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);

        // Adding key-value pairs to the EnumMap
        sizes.put(Size.small, 20);
        sizes.put(Size.medium, 30);
        sizes.put(Size.large, 40);

        // Displaying the entire EnumMap
        System.out.println("EnumMap: " + sizes);

        // Displaying the set of enum keys in the EnumMap
        System.out.println("Enum keys: " + sizes.keySet());

        // Displaying the collection of values in the EnumMap
        System.out.println("Values: " + sizes.values());
    }
}
