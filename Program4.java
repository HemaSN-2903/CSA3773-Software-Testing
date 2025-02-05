import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal (P): ");
        float principal = sc.nextFloat();
        
        System.out.print("Enter Rate of Interest (R): ");
        float rate = sc.nextFloat();
        
        System.out.print("Enter Time (T) in years: ");
        float time = sc.nextFloat();
        
        // Calculate Simple Interest
        float simpleInterest = (principal * rate * time) / 100;
        
        // Print the result
        System.out.println("Simple Interest = " + simpleInterest);
    }
}
