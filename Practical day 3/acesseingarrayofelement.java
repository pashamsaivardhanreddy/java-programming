public class acesseingarrayofelement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        // Trying to access an element outside the valid index range
        int invalidIndex = 5;
        try {
            System.out.println("Element at index " + invalidIndex + ": " + arr[invalidIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
