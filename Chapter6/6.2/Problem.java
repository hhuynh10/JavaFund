//import API's needed here:
import java.util.Scanner;

public class Problem 
{  
        public static void main(String args[ ]) 
        {
            long userInput;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your number: ");
            userInput = input.nextLong();

            System.out.println("Sum of Digits: " + sumDigits(userInput));
         } //closing main method

        public static int sumDigits(long n){
            int sum = 0;
            while (n != 0){
                int digit = (int)n % 10;
                sum += digit;
                n /= 10;
            }
            return sum;
        }
} //closing class header