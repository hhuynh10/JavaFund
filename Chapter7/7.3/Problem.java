import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInput;
        int[] occurrences = new int[101];

        System.out.print("Enter the integers between 1 and 100: ");
        do {
            userInput = input.nextInt();
            if (userInput >= 1 && userInput <= 100){
                occurrences[userInput]++;
            }
        } while (userInput != 0);

        for (int i = 0; i < occurrences.length; i++){
            if (occurrences[i] > 0) {
                String times = occurrences[i] > 1 ? "times" : "time";
                System.out.println(i + " occurs " + occurrences[i] + " " + times);
            }
        }
    }
}
