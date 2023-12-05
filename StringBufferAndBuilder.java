/**
 * This class demonstrates the usage of StringBuffer and StringBuilder in Java,
 * along with a performance comparison between the two in a loop of string
 * appends.
 */
public class StringBufferAndBuilder {

    public static void main(String[] args) {
        // Creating a StringBuffer with an initial value "Hello "
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("World"); // Appending "World" to the StringBuffer
        System.out.println(sb); // Printing the concatenated string

        // Creating a StringBuffer without an initial value
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity()); // Printing the default capacity of StringBuffer (16)

        // Comparing the performance of StringBuffer and StringBuilder
        long startTime = System.currentTimeMillis();

        // Using StringBuffer in a loop for 10000 iterations
        StringBuffer buffer = new StringBuffer(" ");
        for (int i = 0; i < 10000; i++) {
            buffer.append("Hello");
        }

        // Printing the time taken by StringBuffer
        System.out.println("The time taken by StringBuffer:" + (System.currentTimeMillis() - startTime));

        long start = System.currentTimeMillis();

        // Using StringBuilder in a loop for 10000 iterations
        StringBuilder builder = new StringBuilder(" ");
        for (int i = 0; i < 10000; i++) {
            builder.append("Hello");
        }

        // Printing the time taken by StringBuilder
        System.out.println("The time taken by StringBuilder:" + (System.currentTimeMillis() - start));

        // Explaining the performance difference between StringBuffer and StringBuilder
        // StringBuffer is slower than StringBuilder because it is thread-safe, which
        // means
        // it doesn't allow multiple threads to execute its methods at the same time.
    }
}
