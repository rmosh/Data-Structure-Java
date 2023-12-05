import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * This class provides examples of using the List interface in Java with
 * ArrayList, LinkedList, and Vector.
 */
public class ListInterfaceExample {

    public static void main(String[] args) {
        // ArrayList Example
        List<String> arrayList = new ArrayList<String>();
        // ArrayList is a dynamic array, allowing the size to be changed dynamically.
        // Elements can be added or removed dynamically.
        arrayList.add("MR");
        arrayList.add("Moshtaq");
        arrayList.add("Ramazani");
        System.out.println(arrayList);
        // Alternatively, iterate through the ArrayList using a for-each loop
        for (String value : arrayList) {
            System.out.println(value);
        }

        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println("Size of ArrayList: " + arrayList.size());

        // LinkedList Example
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("Java");
        linkedList.add("python");
        linkedList.add("JavaScript");
        System.out.println(linkedList);
        for (String value : linkedList) {
            System.out.println(value);
        }
        linkedList.remove(0);
        linkedList.remove("JavaScript");
        System.out.println(linkedList);
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Vector Example
        List<String> vecList = new Vector<String>();
        System.out.println("Size of Vector: " + vecList.size());
        vecList.add("Programming");
        vecList.add("Networking");
        vecList.add("Database");
        System.out.println(vecList);
        System.out.println("Size of Vector: " + vecList.size());
        /**
         * Comparison between ArrayList, LinkedList, and Vector:
         * 
         * - ArrayList and LinkedList are both implementations of the List interface,
         * providing
         * dynamic arrays. However, they exhibit different performance characteristics:
         * - ArrayList is generally faster in retrieving elements due to its
         * array-backed
         * structure and random access capability.
         * - LinkedList is more efficient in adding or removing elements, especially in
         * the
         * middle of the list, as it involves rearranging pointers rather than shifting
         * elements.
         * 
         * - Vector, like ArrayList, is a dynamic array, but it is synchronized, making
         * it
         * thread-safe. If thread safety is a requirement, use Vector; however, be aware
         * that
         * the synchronization introduces some performance overhead.
         */
    }
}
