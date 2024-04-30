import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userInput;

        do{
            System.out.print("Enter a positive integer: ");
            userInput = input.nextInt();
        } while (userInput < 1);

        if (userInput >=1){
            int product = 1;
            for (int i = 1; i <= userInput; i++){
                product *= i;
            }
            System.out.println(product);
        }
    }
}
