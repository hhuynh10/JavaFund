import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        playGuessingGame(5);
    }

    public static void playGuessingGame(int n) {
        Scanner input = new Scanner(System.in);
        int userInput;
        int count = 0;
        do{
            System.out.print("Guess a number: ");
            userInput = input.nextInt();
            if (userInput > n){
                System.out.println("TRY LOWER.");
            } else if (userInput < n){
                System.out.println("TRY HIGHER.");
            } else {
                System.out.println("CORRECT.");
            }
            count++;
        } while (userInput != n);
        System.out.printf("It took you %d guesses!\n", count);
    }
}
