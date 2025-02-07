import java.util.Scanner;

public class Program8 {

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        long result = calculateFactorial(n);
        System.out.println("The factorial of " + n + " is " + result);
    }
}
