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

            reverse(userInput);
         } //closing main method

        public static void reverse(int number){
            String numString = "" + number;
            String newString = "";
            for (int i = numString.length()-1; i >= 0; i--){
                newString += "" + numString.charAt(i);
            }
            System.out.println(newString);
        }
} //closing class header