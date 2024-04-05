import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store the occurrences of numbers (indices 1 to 100)
        int[] occurrences = new int[101];
        int number;

        // Prompt for user input
        System.out.print("Enter the integers between 1 and 100: ");
        do {
            number = input.nextInt();
            if (number >= 1 && number <= 100) {
                occurrences[number]++;
            }
        } while (number != 0);

        // Display the occurrences of each number
        for (int i = 1; i <= 100; i++) {
            if (occurrences[i] > 0) {
                String times = (occurrences[i] > 1) ? "times" : "time";
                System.out.println(i + " occurs " + occurrences[i] + " " + times);
            }
        }
    }
}
