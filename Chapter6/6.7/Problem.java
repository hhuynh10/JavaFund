//import API's needed here:
import java.util.Scanner;
public class Problem 
{  

        public static void main(String args[ ]) 
        {
            double investmentAmount;
            double monthlyInterestRate;
            int years;
            
            Scanner input = new Scanner(System.in);
            System.out.print("Enter investment amount: ");
            investmentAmount = input.nextDouble();
            System.out.print("Enter monthly interestRate: ");
            monthlyInterestRate = input.nextDouble() / 100;
            System.out.print("Enter number of years: ");
            years = input.nextInt();
			
			System.out.printf("%.2f",futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
         } //closing main method

        public static double futureInvestmentValue(
        double investmentAmount, double monthlyInterestRate,int years){
            double total = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
            return total;
        }
} //closing class header