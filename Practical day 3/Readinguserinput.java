import java.util.Scanner;

public class Readinguserinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any string: ");
        String userInput = scanner.next();

        try {
            int number = Integer.parseInt(userInput);
            System.out.println("Parsed integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred. Invalid input.");
        }
    }
}
