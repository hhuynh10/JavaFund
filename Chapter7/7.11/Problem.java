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

                System.out.println("The mean is: " + mean(arrInput));
                System.out.println("The standard deviation is: " + deviation(arrInput));
         } //closing main method
        
        public static double deviation(double[] arr){
                double sum = 0.0;
                double standardDeviation;
                for (int i = 0; i < arr.length; i++){
                        sum += Math.pow(arr[i] - mean(arr), 2);
                }
                standardDeviation = Math.sqrt(sum / arr.length);
                return standardDeviation;
        }

        public static double mean(double[] arr){
                double total = 0.0;
                double mean;
                for (int i = 0; i < arr.length; i++){
                        total += arr[i];
                }
                mean = total / arr.length;
                return mean;
        }
} //closing class header