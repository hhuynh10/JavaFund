package Workshop.WS3.Problem2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 + num2 == 10) System.out.println(num1 + " + " + num2 + " sums up to 10");
        else System.out.println("Does not sum up to 10");

        if (num1 == 10 || num2 == 10) System.out.println("One number is 10");
        else System.out.println("Neither number is 10");
    }
}
