import java.util.Scanner;

public class Program5 {

    public static boolean isPalindrome(int n) {
        int r, sum = 0, temp;
        temp = n;
        
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = (sum * 10) + r;
        }

        return temp == sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        
        if (isPalindrome(n))
            System.out.println(n + " is a palindrome number");
        else
            System.out.println(n + " is not a palindrome number");
    }
}
