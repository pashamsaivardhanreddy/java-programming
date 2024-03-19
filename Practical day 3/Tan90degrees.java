import java.io.*;

class TanExceptionDemo {
    public static void main(String[] args) {
        double angleInDegrees = 90.0; // Replace with any angle

        try {
            double tanValue = Math.tan(Math.toRadians(angleInDegrees));
            System.out.println("Tan(" + angleInDegrees + ") = " + tanValue);
        } catch (ArithmeticException e) {
            System.out.println("Tangent of 90 degrees is undefined.");
        }
    }
}
