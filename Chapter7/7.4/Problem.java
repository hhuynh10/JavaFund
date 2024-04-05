//import API's needed here:
import java.util.Arrays;
import java.util.Scanner;

public class Problem 
{  
        public static void main(String args[ ]) 
        {       
                int userInput;
                int[] scoreArr = new int[101];
                int count = 0;
                int sum = 0;
                double avg;
                int posCount = 0;
                int negCount = 0;
                Scanner input = new Scanner(System.in);

                System.out.print("Enter a score between 0 and 100 (negative number to stop): ");
                do {
                        userInput = input.nextInt();
                        if (userInput >= 0 && userInput <= 100){
                                scoreArr[count] = userInput;
                                count++;
                        } else if (userInput > 100){
                                System.out.println("Invalid input");
                        }
                } while (userInput >= 0 && count < scoreArr.length);

                for (int i = 0; i < count; i++){
                        sum += scoreArr[i];
                }

                avg = sum / count;

                for (int i = 0; i < count; i++){
                        if (scoreArr[i] > avg){
                                posCount++;
                        } else {
                                negCount++;
                        }
                }

                System.out.println(avg);
                System.out.println("Below average: " + negCount +"\n" + "Above average: " + posCount);
         } //closing main method
} //closing class header