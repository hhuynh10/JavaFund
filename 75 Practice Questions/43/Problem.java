public class Problem {
    public static void main(String[] args){
        int[][] arr = numberTriangleArray(6);

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.printf("%-4d" ,arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int [][] numberTriangleArray(int n){
        int[][] nestedArr = new int[n][n];
        for (int i = 0; i < nestedArr.length; i++){
            for (int j = 0; j <= nestedArr[i].length - (nestedArr.length - i); j++){
                nestedArr[i][j] = j;
            }
        }
        return nestedArr;
    }
}
