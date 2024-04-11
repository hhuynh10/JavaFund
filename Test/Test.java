import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int points = 50;
        runTest(points);
    }

    public static int[] randNumbers(int n) {
        int[] randNumberList = new int[n];
        for (int i = 0; i < randNumberList.length; i++) {
            randNumberList[i] = (int)(Math.random() * 20);
        }
        return randNumberList;
    }

    public static String randNumberString(int[] arr){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        return str;
    }

    public static double average(int[] arr) {
        double avg;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (double) sum / arr.length;
        return avg;
    }

    public static void runTest(int points) {
        Scanner input = new Scanner(System.in);
        int[] avgInts = randNumbers(10);
        String avgIntsString = randNumberString(avgInts);
        System.out.print("What is the average for this set of numbers: " + avgIntsString + "\nYour answer: ");
        double userInput = input.nextDouble();
        if (userInput == average(avgInts)) {
            points++;
        }
        System.out.println("Correct average: " + average(avgInts));
        System.out.println("Points: " + points);
    }
}
