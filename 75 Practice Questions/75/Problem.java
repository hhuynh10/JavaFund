import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();
        char[][] arr = plusInSquare(userInput);

        for (int i = 0; i < arr.length; i++){
            for ( int j = 0; j < arr[i].length; j++){
                System.out.printf("%-4c", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static char[][] plusInSquare(int n) {
        char[][] arr = new char[n][n];
        for (int i = 0; i < arr.length; i++){
            for ( int j = 0; j < arr[i].length; j++){
                if (i != 0 && i != n/2 && i != n-1){
                    if (j != 0 && j != n/2 && j != n-1){
                        arr[i][j] = '.';
                    } else {
                        arr[i][j] = 'X';
                    }
                } else {
                    arr[i][j] = 'X';
                }
            }
        }
        return arr;
    }
}
