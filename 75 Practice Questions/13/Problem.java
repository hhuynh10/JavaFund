import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userInput;
        int count = 1;
        int countDistinct = 0;
        int[] arr = new int[10000];

        while (count < 2){
            System.out.print("Enter an int: ");
            userInput = input.nextInt();
            for (int i = 0; i <= countDistinct; i++){
                if (arr[i] == userInput){
                    count++;
                }
            }
            arr[countDistinct] = userInput;
            countDistinct++;
        }
        System.out.println("You entered " + (countDistinct) + (countDistinct > 1 ? " values." : " value."));
    }
}
