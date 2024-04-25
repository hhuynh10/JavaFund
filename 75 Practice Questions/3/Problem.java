import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        int userInput;
        int prevInput = 0; 
        int attempts = 1; 

        while (attempts < 3) {
            System.out.print("Enter an integer: ");
            userInput = input.nextInt();
            if (userInput == prevInput) {
                attempts++;
            } else {
                attempts = 1; 
                prevInput = userInput; 
            }
        }

        if (attempts == 3){
            System.out.println("Same number entered 3 times in a row.");
        }
    }
}
