public class Itiratingarray {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Banana", "Orange" };

        // Incorrect loop condition (should be < instead of <=)
        for (int i = 0; i <= fruits.length; i++) {
            try {
                System.out.println(fruits[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
}
