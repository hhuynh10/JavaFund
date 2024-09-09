package Workshop.WS3.Problem1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 % 10 == num2 % 10) System.out.println("Same last digit");
        else System.out.println("Different last digits");
    }
}
