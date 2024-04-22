public class Problem {
    public static void main(String [] args){
        double[][] matrix = new double[3][4];
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = Math.round((Math.random() * 10.0) * 100.00) / 100.00;
            }
        }

        display(matrix);
        sumColumn(matrix, 0);
        sumColumn(matrix, 1);
        sumColumn(matrix, 2);
    }

    public static void display(double[][] matrix){
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("%-6.2f", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static double sumColumn(double[][] matrix, int columnIndex){
        double result = 0;
        for (int j = 0; j < matrix[columnIndex].length; j++){
            result += matrix[columnIndex][j];
        }
        System.out.println("Sum of the elements at column " + columnIndex +" is " + result);
        return result;
    }
}
