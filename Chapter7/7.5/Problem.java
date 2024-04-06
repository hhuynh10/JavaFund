import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter 10 numbers
        System.out.print("Enter 10 numbers: ");
        
        // Create an array to store distinct numbers
        int[] distinctNumbers = new int[10]; // Maximum size is 10
        
        // Read numbers and store distinct ones in the array
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            
            // Check if the number is already in the array
            boolean isNew = true;
            int j = 0;
            while (j < count && isNew) {
                if (distinctNumbers[j] == number) {
                    isNew = false;
                }
                j++;
            }
            
            // If the number is new, add it to the array
            if (isNew) {
                distinctNumbers[count] = number;
                count++;
            }
        }
        
        // Display the number of distinct numbers
        System.out.println("The number of distinct numbers is " + count);
        
        // Display the distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }
        
        scanner.close();
    }
}
