public class Incorrectarraypassing {
    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3 };

        // Passing an incorrect array (different size)
        printArray(originalArray);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
