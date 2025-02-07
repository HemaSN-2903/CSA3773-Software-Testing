import java.util.Scanner;

public class Program7 {

    public static void convertDays(int totalDays) {
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        System.out.println(totalDays + " days is equivalent to:");
        System.out.println(years + " years, " + weeks + " weeks, and " + days + " days.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        convertDays(totalDays);
    }
}
