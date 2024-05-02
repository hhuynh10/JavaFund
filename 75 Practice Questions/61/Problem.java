import java.util.Arrays;
import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        System.out.print("Enter number of column: ");
        int col = input.nextInt();
        int[][] arr = createArray(row, col);
        System.out.println(Arrays.deepToString(arr));
    }

    public static int[][] createArray(int row, int col){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++){
            System.out.printf("Enter 5 integers for row %d: ", i);
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
}
