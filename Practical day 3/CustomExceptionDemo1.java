class NonIntegerValueException extends Exception {
    public NonIntegerValueException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo1 {

    public void processIntegerValue(String value) throws NonIntegerValueException {
        try {
            int intValue = Integer.parseInt(value);
            // Process the integer value
        } catch (NumberFormatException e) {
            throw new NonIntegerValueException("Non-integer value entered.");
        }
    }

    public static void main(String[] args) {
        CustomExceptionDemo1 demo = new CustomExceptionDemo1();

        // Example usage
        try {
            demo.processIntegerValue("abc"); // Non-integer value
        } catch (NonIntegerValueException e) {
            System.out.println(e.getMessage());
        }

        try {
            demo.processIntegerValue("123"); // Integer value
        } catch (NonIntegerValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
