import java.util.Scanner;

public class Problem {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[] numArr = new int[10];
        int count = 0;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int userInput = input.nextInt();
            boolean isNew = true;

            for (int j = 0; j < count; j++) {
                if (numArr[j] == userInput) {
                    isNew = false;
                    break;
                }
            }

            if (isNew) {
                numArr[count] = userInput;
                count++;
            }
        }

        System.out.println("The number of distinct numbers is: " + count);

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numArr[i] + " ");
        }

    } // closing main method
} // closing class header
