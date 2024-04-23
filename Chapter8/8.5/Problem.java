import java.util.Arrays;

public class Problem {
    public static void main (String[] args){
        int size = (int)(Math.random() * 3) + 3;
        double[][] matrix1 = arrGen(size);
        display(matrix1);
        System.out.println();
        double[][] matrix2 = arrGen(size);
        display(matrix2);
        System.out.println();
        display(addMatrix(matrix1, matrix2));
    }

    public static double[][] arrGen(int size){
        double[][] matrix = new double[size][size];
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = Math.round((Math.random() * 10.0) * 100.0) / 100.0;
            }
        }
        return matrix;
    }

    public static void display(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0 ; j < matrix[i].length; j++){
                System.out.printf("%-8.2f", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] matrix = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++){
            for (int j = 0 ; j < a[i].length; j++){
                matrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return matrix;
    }
}
