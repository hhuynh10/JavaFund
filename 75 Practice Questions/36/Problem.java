import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 1;

        System.out.print("Enter int: ");
        int userInput = input.nextInt();
        while (userInput != sum) {
            count++;
            sum += userInput;
            System.out.print("Enter int: ");
            userInput = input.nextInt();
        }
        System.out.println("You entered " + count + " ints.");
    }
}
