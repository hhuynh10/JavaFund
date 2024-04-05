//import API's needed here:
import java.util.Arrays;
import java.util.Scanner;
public class Problem 
{  
        public static void main(String args[ ]) 
        {
                int[] numArr = new int[10];
                Scanner input = new Scanner(System.in);
                System.out.print("Enter 10 numbers: ");

                for (int i = 0; i < numArr.length; i++){
                        numArr[i] = input.nextInt();
                }

                System.out.println(Arrays.toString(numArr));
         } //closing main method
} //closing class header