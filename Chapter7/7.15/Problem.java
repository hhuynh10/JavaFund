import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinctNumbers = eliminateDuplicates(numbers);

        System.out.print("Distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] arr) {
        int count = 0;
        int[] distinctNumbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            boolean isNew = true;
            int j = 0;
            while (j < count) {
                if (arr[j] == arr[i]) {
                    isNew = false;
                    j = count;
                }
                j++;
            }
            if (isNew) {
                distinctNumbers[count] = arr[i];
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = distinctNumbers[i];
        }
        return result;
    }
}
