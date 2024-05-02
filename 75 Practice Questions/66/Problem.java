import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int userInput = input.nextInt();
        int max = userInput;
        int min = userInput;
        int sum = 0;
        while (userInput > 0){
            sum += userInput;
            max = Math.max(max, userInput);
            min = Math.min(min, userInput);
            System.out.print("Enter a positive integer: ");
            userInput = input.nextInt();
        }
        sum -= (max + min);

        System.out.printf("The sum of these, not counting the lowest and highest, is %d.", sum);
    }
}
