import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userInput;
        int prevInput = 0;
        int count = 1;
        int countDistinct = 0;

        while (count < 2){
            System.out.print("Enter an int: ");
            userInput = input.nextInt();
            if (prevInput == userInput){
                count++;
            } else {
                prevInput = userInput;
            }
            countDistinct++;
        }
        System.out.println("You entered " + (countDistinct - 1) + (countDistinct - 1 > 1 ? " values." : " value."));
    }
}
