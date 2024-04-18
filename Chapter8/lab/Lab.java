import java.util.Scanner;

public class Lab {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] list = new int[100];
        int count = 0;
        int userInput;
        System.out.print("Enter a number: ");
        userInput = input.nextInt();
        while (userInput >= 0){
            list[count] = userInput;
            count++;
            System.out.print("Enter a number: ");
            userInput = input.nextInt();
        }

        System.out.println("Average: " + avgCalculation(list, count));
        System.out.println("Sum of even numbers: " + sumEven(list, count));
        System.out.println("Largest Number: " + findMax(list, count));
    }

    public static float avgCalculation(int[] list, int count){
        float avg;
        float sum = 0;
        for (int i = 0; i < count; i++){
            sum += list[i];
        }
        avg = (float)(sum / count);
        return avg;
    }

    public static int sumEven(int[] list, int count){
        int sum = 0;
        for (int i = 0; i < count; i++){
            if (list[i] % 2 == 0){
                sum += list[i];
            }
        }
        return sum;
    }

    public static int findMax(int[] list, int count){
        int max = 0;
        for (int i = 0; i < count; i++){
            max = Math.max(max, list[i]);
        }
        return max;
    }
}
