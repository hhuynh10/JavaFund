//import API's needed here:
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Problem
{  
        public static void main(String args[ ]) 
        {       
                int[] userInput;
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the number of students: ");
                userInput = new int[input.nextInt()];

                for (int i = 0; i < userInput.length; i++){
                        System.out.print("Enter " + userInput.length + " scores: ");
                        userInput[i] = input.nextInt();
                }
		System.out.println(Arrays.toString(userInput));
         } //closing main method
} //closing class header
