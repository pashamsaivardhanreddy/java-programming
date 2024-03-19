class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    public void processValue(int value) throws NegativeValueException {
        if (value < 0) {
            throw new NegativeValueException("Negative values are not allowed");
        }
        // Process value
    }

    public static void main(String[] args) {
        CustomExceptionDemo demo = new CustomExceptionDemo();

        // Example usage
        try {
            demo.processValue(-5);
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }
    }
}

