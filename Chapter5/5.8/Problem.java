//import API's needed here:
import java.util.Scanner;

public class Problem 
{  
        public static void main(String args[ ]) 
        {   
            int numStudent;
            int score;
            String name;
            int maxScore = 0;
            String maxName = "";

            Scanner input = new Scanner(System.in);

            System.out.print("How many students? (at least 1) ");
            numStudent = input.nextInt();

            while (numStudent > 0){
                System.out.print("Student name: ");
                name = input.next();
                System.out.print("Student score: ");
                score = input.nextInt();
                numStudent--;
                if (score > maxScore){
                    maxScore = score;
                    maxName = name;
                }
            }
            
            System.out.println("Name of the student with the highest score: " + maxName);
         } //closing main method
} //closing class header