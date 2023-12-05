public class MultiDimensionArray {
    public static void main(String[] args) {
        int marks[][] = { { 45, 78 }, { 56, 68 } };

        // display the marks array
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
