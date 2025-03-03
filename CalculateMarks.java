import java.util.Scanner;

public class CalculateMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter physics marks ");
        int physics = input.nextInt();
        
        System.out.print("Enter chemistry marks ");
        int chemistry = input.nextInt();
        
        System.out.print("Enter maths marks ");
        int maths = input.nextInt();
        
        float average = (physics+chemistry+maths)/(float)3;
        System.out.printf("The average marks are: %.2f\n", average);

        if(average >= 80){
            System.out.print("Level 4, above agency-normalized standards");
        }
        else if(average >= 70){
            System.out.print("Level 3, at agency-normalized standards");
        }
        else if(average >= 60){
            System.out.print("Level 2, below, but approaching agency-normalized standard");
        }
        else if(average >= 50){
            System.out.print("Level 1, well below agency-normalized standards");
        }
        else if(average >= 40){
            System.out.print("Level 1- , too below agency-normalized standards");
        }
        else{
            System.out.print("Remedial standard");
        }
        
        input.close();
    }
}
