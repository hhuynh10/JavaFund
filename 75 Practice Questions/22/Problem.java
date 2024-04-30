import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userInput;
        int prevInput = 0;
        int count = 0;
        
        do {
            System.out.print("Enter an integer: ");
            userInput = input.nextInt();
            if (userInput > prevInput){
                prevInput = userInput;
            }
            count++;
        } while(userInput >= prevInput);

        System.out.println("You entered " + count + (count > 1 ? " integers." : " integer."));
        System.out.println("The last one entered was " + userInput + " and the one before that was " + prevInput + ".");
    }
}
