package Workshop.WS3.Problem3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        
        if (max % min == 0) System.out.println(min + " is a factor of " + max);
        else System.out.println(min + " is NOT a factor of " + max);
    }
}
