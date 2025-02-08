import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        double number = scanner.nextDouble();

        // Calculate the square and cube of the number
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);

        // Display the results
        System.out.println("Square of " + number + " is: " + square);
        System.out.println("Cube of " + number + " is: " + cube);

        // Close the scanner
        scanner.close();
    }
}
