import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int sumUsingLoop = 0;
            int counter = 1;
            
            while (counter <= n) {
                sumUsingLoop += counter;
                counter++;
            }
            
            int sumUsingFormula = n * (n + 1) / 2;
            
            System.out.println("Sum using while loop: " + sumUsingLoop);
            System.out.println("Sum using formula: " + sumUsingFormula);
            
            if (sumUsingLoop == sumUsingFormula) {
                System.out.println("Both computations match and are correct.");
            } else {
                System.out.println("There is an error in computation.");
            }
        }
        
        input.close();
    }
}
