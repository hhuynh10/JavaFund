package Chapter9.Problem13;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        System.out.println();

        double[][] array = new double[row][column];

        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble(); 
            }
        }

        Location largestLocation = Location.locateLargest(array);

        System.out.println("The location of the largest element is " + largestLocation.maxValue + " at (" + largestLocation.row + ", " + largestLocation.column + ")");
    }
}