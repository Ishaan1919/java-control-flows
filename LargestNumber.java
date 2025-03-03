import java.util.Scanner;

public class LargestNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter number 2: ");
		int number2 = input.nextInt();
		
		System.out.print("Enter number 3: ");
		int number3 = input.nextInt();

		System.out.println();
		
		if(number1 > number2 && number1 > number3){
			System.out.print(number1 + " is the largest number");
		}

		if(number2 > number1 && number2 > number3){
			System.out.print(number2 + " is the largest number");
		}

		if(number3 > number1 && number3 > number2){
			System.out.print(number3 + " is the largest number");
		}
		
		input.close();
	}
}