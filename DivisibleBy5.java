import java.util.Scanner;

public class DivisibleBy5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.print("The number " + number);
		if(number%5==0){
			System.out.print(" is divisible by 5");
		}
		else{
			System.out.print(" is not divisible by 5");
		}
		input.close();
	}
}