import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = input.nextInt();
        int quarters = 0;
        int nickels = 0;
        int pennies = 0;

        while (userInput > 0){
            if (userInput - 25 >= 0){
                quarters++;
                userInput -= 25;
            } else if (userInput - 5 >= 0){
                nickels++;
                userInput -= 5;
            } else if (userInput - 1 >= 0){
                pennies++;
                userInput -= 1;
            }
        }

        System.out.println(quarters + " quarters");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}
