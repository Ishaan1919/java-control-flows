import java.util.Scanner;

public class CanVote{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the age: ");
		int age = input.nextInt();
		if(age>=18){
            System.out.print("The person can vote");
        }
        else{
            System.out.print("The person can not vote");
        }
        
        input.close();
	}
}