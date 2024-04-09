import java.util.Arrays;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names;
        int[] scores;

        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        names = new String[numStudents];
        scores = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name: ");
            names[i] = input.next();
            System.out.print("Enter score: ");
            scores[i] = input.nextInt();
        }

        System.out.println("Names and Scores:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }
    }
}

