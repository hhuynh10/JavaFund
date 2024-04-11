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
            while (scores[i] < 0 || scores[i] > 100) {
                System.out.print("Invalid score! Enter score between 0 and 100: ");
                scores[i] = input.nextInt();
            }
        }
        
        sort(scores, names);
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i] + ": " + "rank " + (i+1));
        }
    }

    public static String[] sort(int[] arr1, String[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                if (arr1[j] < arr1[j + 1]) {
                    int temp1 = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp1;

                    String temp2 = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp2;
                }
            }
        }
        return arr2;
    }
}

