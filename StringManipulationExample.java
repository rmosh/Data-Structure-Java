public class StringManipulationExample {
    public static void main(String[] args) {
        // declare string using string literal
        String str1 = "Hello ";
        System.out.println(str1);
        // delcare string using string object
        String str2 = new String("World");
        System.out.println(str2);

        // concatenating string literal and string object
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        // using some of the string methods
        System.out.println(str3.length());
        System.out.println(str1.concat(str2));
        System.out.println(str3.substring(0, 5));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str3.toUpperCase());
        System.out.println(str1.trim());
        System.out.println(str2.trim());

    }
}
