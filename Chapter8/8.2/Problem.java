public class Problem {
    public static void main(String[] args){
        double[][] matrix = new double[4][4];
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = Math.round((Math.random() * 10.0) * 100.00) / 100.00;
            }
        }
        display(matrix);
        sumMajorDiagonal(matrix);
    }

    public static void display(double[][] matrix){
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("%-6.2f", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static double sumMajorDiagonal(double[][] matrix){
        double total = 0.0;
        int count = 0;
        while (count < matrix[0].length){
            total += matrix[count][count];
            count++;
        }
        System.out.println("Sum of the elements in the major diagonal is " + total);
        return total;
    }
}
