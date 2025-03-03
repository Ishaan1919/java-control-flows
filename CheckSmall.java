import java.util.Scanner;

public class CheckSmall{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter number 2: ");
		int number2 = input.nextInt();
		
		System.out.print("Enter number 3: ");
		int number3 = input.nextInt();
		
		System.out.print(number1);
		
		if(number1 < number2 && number1 < number3){
			System.out.print(" is the smallest number");
		}
		else{
			System.out.print(" is not the smallest number");
		}
		input.close();
	}
}