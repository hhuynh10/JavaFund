//import API's needed here:
import java.util.Scanner;

public class Problem 
{  
        public static void main(String args[ ]) 
        {
            int userInput;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            userInput = input.nextInt();
            
			if (isPalindrome(userInput)){
                System.out.println("Your number is a Palindrome");
            } else {
                System.out.println("Your number is NOT a Palindrome");
            }
         } //closing main method

        public static int reverse(int number){
            String numString = "" + number;
            String newString = "";
            for (int i = numString.length()-1; i >= 0; i--){
                newString += "" + numString.charAt(i);
            }
            return Integer.parseInt(newString);
        }

        public static boolean isPalindrome(int number){
            return reverse(number) == number;
        }
} //closing class header