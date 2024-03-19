import java.text.DecimalFormat;

public class Decimalformat {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");

        try {
            String formattedNumber = decimalFormat.format("1234.567");
            System.out.println("Formatted number: " + formattedNumber);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred. Invalid format.");
        }
    }
}
