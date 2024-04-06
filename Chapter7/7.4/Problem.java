//import API's needed here:
import java.util.Scanner;

public class Problem 
{  
        public static void main(String args[ ]) 
        {       
                Scanner input = new Scanner(System.in);

                int userInput;
                int[] scoreList = new int[101];
                int count = 0;
                int total = 0;
                double avg;
                int below = 0;
                int above = 0;

                System.out.print("Enter score: ");
                do {
                        userInput = input.nextInt();
                        if (userInput >= 0 && userInput <= 100){
                                scoreList[count] = userInput;
                                total += scoreList[count];
                                count++;
                        }
                } while (userInput >= 0 && count <= scoreList.length);

                avg = (double)total / count;

                for (int i = 0; i < count; i++){
                        if (scoreList[i] > avg){
                                above++;
                        } else {
                                below++;
                        }
                }

                System.out.println("Average is: " + avg);
                System.out.println("Number of score above average: " + above + "\n" + "Number of score below average: " + below);
                
         } //closing main method
} //closing class header





//                 int userInput;
//                 int[] scoreArr = new int[101];
//                 int count = 0;
//                 int sum = 0;
//                 double avg;
//                 int posCount = 0;
//                 int negCount = 0;
//                 Scanner input = new Scanner(System.in);

//                 System.out.print("Enter a score between 0 and 100 (negative number to stop): ");
//                 do {
//                         userInput = input.nextInt();
//                         if (userInput >= 0 && userInput <= 100){
//                                 scoreArr[count] = userInput;
//                                 count++;
//                         } else if (userInput > 100){
//                                 System.out.println("Invalid input");
//                         }
//                 } while (userInput >= 0 && count < scoreArr.length);

//                 for (int i = 0; i < count; i++){
//                         sum += scoreArr[i];
//                 }

//                 avg = sum / count;

//                 for (int i = 0; i < count; i++){
//                         if (scoreArr[i] > avg){
//                                 posCount++;
//                         } else {
//                                 negCount++;
//                         }
//                 }

//                 System.out.println(avg);
//                 System.out.println("Below average: " + negCount +"\n" + "Above average: " + posCount);