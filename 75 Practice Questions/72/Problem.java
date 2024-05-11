import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double userInput = input.nextDouble();
        double sum = userInput;
        int count = 1;

        while (sum != 10){
            System.out.print("Enter a number: ");
            userInput = input.nextDouble();
            sum += userInput;
            count++;
        }

        System.out.println(count);
    }
}
