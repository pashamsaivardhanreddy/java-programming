import java.io.*;

class LogarithmExceptionDemo {
    public static void main(String[] args) {
        double x = -2.0; // Replace with any non-positive value

        try {
            double result = Math.log(x);
            System.out.println("Logarithm result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Logarithm of negative or zero value is undefined.");
        }
    }
}
