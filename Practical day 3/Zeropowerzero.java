import java.io.*;

class ZeroPowerZeroDemo {
    public static void main(String[] args) {
        double base = 0.0;
        double exponent = 0.0;

        try {
            double result = Math.pow(base, exponent);
            System.out.println(base + " ^ " + exponent + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Zero raised to the power of zero is undefined.");
        }
    }
}
