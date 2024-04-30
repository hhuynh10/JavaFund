import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter int: ");
        int userInput = input.nextInt();
        int max = userInput;
        int min = userInput;
        while (userInput != 10){
            System.out.print("Enter int: ");
            userInput = input.nextInt();
            max = Math.max(max, userInput);
            min = Math.min(min, userInput);
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
