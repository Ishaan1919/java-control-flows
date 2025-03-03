import java.util.Scanner;

public class SumOfNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number<=0){
            System.out.print(number + " is not a natural number");
        }
        else{
            int sum = (number*(number+1))/2;
            System.out.print("The sum of " + number + " natural numbers is " + sum);
        }
        input.close();
	}
}