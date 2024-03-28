//import API's needed here:
import java.util.Scanner;
public class Problem 
{  
        public static void main(String args[ ]) 
        {   
            double num1;
            double num2;
            double num3;
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            num1 = input.nextDouble();
            System.out.print("Enter second number: ");
            num2 = input.nextDouble();
            System.out.print("Enter third number: ");
            num3 = input.nextDouble();

            displaySortedNumbers(num1, num2, num3);
         } //closing main method
        public static void displaySortedNumbers(double num1, double num2, double num3){
            double max = Math.max(Math.max(num1, num2), num3);
            double min = Math.min(Math.min(num1, num2), num3);
            double mid = (num1 + num2 + num3) - (max + min);
            System.out.println(min + " " + mid + " " + max);
        }
} //closing class header