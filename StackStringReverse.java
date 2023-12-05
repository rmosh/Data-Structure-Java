import java.util.Stack;

public class StackStringReverse {
    public static void main(String[] args) {
        String name = "Moshtaq";
        StringReverser reverser = new StringReverser();
        String nameReverse = reverser.reverse(name);

        System.out.println("This is the name: " + name);
        System.out.println("This is the name reverse:" + nameReverse);

    }
}

class StringReverser {

    /**
     * Reverses the given string using a Stack.
     *
     * @param input The input string to be reversed.
     * @return The reversed string.
     */
    public String reverse(String input) {
        // Creating a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Pushing each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Reversing the string by popping characters from the stack
        String reversed = "";
        while (!stack.empty()) {
            reversed += stack.pop();
        }
        // Returning the reversed string
        return reversed;
    }
}