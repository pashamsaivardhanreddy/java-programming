public class IllegalArgumentExceptionDemo {

    // Method requiring non-negative values
    public void calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        // Calculate square root
    }

    // Method with enum parameter
    enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    public void printDay(Day day) {
        if (day == null) {
            throw new IllegalArgumentException("Enum constant cannot be null");
        }
        // Print day
    }

    // Method with range parameter
    public void setTemperature(int temperature) {
        if (temperature < 0 || temperature > 100) {
            throw new IllegalArgumentException("Temperature must be between 0 and 100");
        }
        // Set temperature
    }

    // Method requiring non-empty string
    public void processString(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        // Process string
    }

    public static void main(String[] args) {
        IllegalArgumentExceptionDemo demo = new IllegalArgumentExceptionDemo();

        // Example usage
        try {
            demo.calculateSquareRoot(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            demo.printDay(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            demo.setTemperature(120);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            demo.processString("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
