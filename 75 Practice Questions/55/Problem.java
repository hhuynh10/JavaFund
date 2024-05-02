import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userInput;

        do{
            System.out.print("Enter positive integer n: ");
            userInput = input.nextInt();
        } while(userInput < 1);

        int[] arr = new int[userInput];
        int sum = 0;
        int odd = 0;
        int max = arr[0];
        System.out.print("Now enter " + userInput + " integers: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
            sum += arr[i];
            max = Math.max(max, arr[i]);
            if (arr[i] % 2 != 0){
                odd++;
            }
        }

        System.out.println("Largest value entered: " + max);
        System.out.println("Number of odd values: " + odd);
        System.out.println("Sum of all values: " + sum);
    }
}
