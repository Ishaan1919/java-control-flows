import java.util.Scanner;

public class CheckNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		if(number<0){
			System.out.print("Negative Number");
		}
		else if(number==0){
			System.out.print("Zero Number");
		}
		else{
			System.out.print("Positive Number");
		}
	}
}
