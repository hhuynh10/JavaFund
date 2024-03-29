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


            System.out.println(isPrime(userInput));
         } //closing main method

        public static boolean isPrime(int number){
                if (number <= 1){
                        return false;
                }
                for (int i = 2; i < number; i++){
                        if (number % i == 0){
                                return false;
                        }
                }
                return true;
        }
} //closing class header