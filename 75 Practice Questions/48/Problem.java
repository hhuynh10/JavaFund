import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int userInput = input.nextInt();
        int count = 1;
        int prev = userInput;
        int sum = userInput;

        while (count < 3){
            System.out.print("Enter an int: ");
            userInput = input.nextInt();
            if (userInput == prev+1){
                count++;
                prev++;
            } else {
                count = 1;
                prev = userInput;
            }
            sum += userInput;
        }
        
        System.out.println(sum);
    }
}
