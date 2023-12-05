public class SingleArray {
    public static void main(String[] args) {
        // decare and allowcate memory to the array
        int marks[] = new int[5];
        marks[0] = 55;
        marks[1] = 60;
        marks[2] = 90;
        marks[3] = 85;
        marks[4] = 40;

        // display the marks array

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("###################");
        // display the marks array using shorthand for loop
        for (int value : marks) {
            System.out.println(value);
        }

    }
}