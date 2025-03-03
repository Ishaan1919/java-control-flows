import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long factorial = 1;
            int counter = n;
            
            while (counter > 0) {
                factorial *= counter;
                counter--;
            }
            
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        
        input.close();
    }
}
