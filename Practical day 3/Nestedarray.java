public class Nestedarray {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2 }, { 3, 4 } };

        // Incorrect index (should be matrix[1][2])
        try {
            System.out.println("Element at index [1][2]: " + matrix[1][2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
