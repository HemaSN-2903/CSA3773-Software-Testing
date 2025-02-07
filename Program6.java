import java.util.Scanner;

public class Program6 {

    public static String toBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String toOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String binary = toBinary(decimal);
        String octal = toOctal(decimal);

        System.out.println("Binary equivalent: " + binary);
        System.out.println("Octal equivalent: " + octal);
    }
}
