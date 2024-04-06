//import API's needed here:
import java.util.Scanner;

public class Problem 
{  
        public static void main(String args[ ]) 
        {
                Scanner input = new Scanner(System.in);
                
                double[] arrInput = new double[10];
                
                System.out.print("Enter 10 numbers: ");
                for (int i = 0; i < arrInput.length; i++){
                        arrInput[i] = input.nextDouble();
                }

                System.out.println(min(arrInput));
         } //closing main method
        
        public static double min(double[] arr){
                double min = arr[0];
                for (int i = 0; i < arr.length; i++){
                        if (min > arr[i]){
                                min = arr[i];
                        }
                }
                return min;
        }
} //closing class header