//import API's needed here:
import java.util.Scanner;

public class Problem 
{  
        public static void main(String args[ ]) 
        {
            int userInput;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your number: ");
            userInput = input.nextInt();

			displayPattern(userInput);
         } //closing main method

        public static void displayPattern(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print("    ");
            }
            for (int j = i; i >= 1; j--){
                System.out.printf("%4d", j);
            }
            System.out.println();
        }
        }
} //closing class header