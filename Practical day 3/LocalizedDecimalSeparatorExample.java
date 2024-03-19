import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocalizedDecimalSeparatorExample {
    public static void main(String[] args) {
        String localizedNumber = "1,234.56"; // Example with comma as decimal separator

        try {
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
            double parsedValue = numberFormat.parse(localizedNumber).doubleValue();
            System.out.println("Parsed value: " + parsedValue);
        } catch (ParseException e) {
            System.out.println("ParseException occurred. Invalid localized number format.");
        }
    }
}
