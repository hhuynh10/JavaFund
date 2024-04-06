//import API's needed here:
import java.util.Scanner;

public class Problem
{  
        public static void main(String args[ ]) 
        {       
                int[] userInput;
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the number of students: ");
                userInput = new int[input.nextInt()];
                
                int maxScore = userInput[0];
                System.out.print("Enter " + userInput.length + " scores: ");
                for (int i = 0; i < userInput.length; i++){
                        userInput[i] = input.nextInt();
                        maxScore = Math.max(maxScore, userInput[i]);
                }

		for (int i = 0; i < userInput.length; i++){
                        if (userInput[i] >= maxScore - 10){
                                System.out.println("Student " + (i + 1) + " score is " + userInput[i] + " and grade is A");
                        } else if (userInput[i] >= maxScore - 20){
                                System.out.println("Student " + (i + 1) + " score is " + userInput[i] + " and grade is B");
                        } else if (userInput[i] >= maxScore - 30){
                                System.out.println("Student " + (i + 1) + " score is " + userInput[i] + " and grade is C");
                        } else if (userInput[i] >= maxScore - 40){
                                System.out.println("Student " + (i + 1) + " score is " + userInput[i] + " and grade is D");
                        } else {
                                System.out.println("Student " + (i + 1) + " score is " + userInput[i] + " and grade is F");
                        }
                }
         } //closing main method
} //closing class header
