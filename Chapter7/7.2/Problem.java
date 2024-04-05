//import API's needed here:
import java.util.Scanner;
public class Problem 
{  
        public static void main(String args[ ]) 
        {
                int[] numArray = new int[10];
                Scanner input = new Scanner(System.in);
                System.out.print("Enter 10 numbers: ");
                for (int i = 0; i < numArray.length; i++){
                        numArray[i] = input.nextInt();
                }

                for (int i = numArray.length - 1; i >= 0; i--){
                        System.out.print(numArray[i] + " ");
                }
                
         } //closing main method
} //closing class header