import java.util.Scanner;

public class Parsingofnonnumericstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter any valid integer: ");
            try {
                int number = Integer.parseInt(scanner.next());
                System.out.println("You entered: " + number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException occurred. Please enter a valid integer.");
            }
        }
    }
}
