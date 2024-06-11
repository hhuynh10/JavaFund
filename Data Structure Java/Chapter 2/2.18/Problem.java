public class Problem {
    public static void main(String[] args) {
        int[][] res = pascal(10);
        for (int i = 0; i < res.length; i++){
            for (int j = 0; j < res[i].length; j++){
                System.out.printf("%-4d", res[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] pascal(int n){
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++){
            res[i][0] = res[i][i] = 1;
        }
        for (int i = 2; i < n; i++){
            for (int j = 1; j < i; j++){
                res[i][j] = res[i-1][j-1] + res[i-1][j];
            }
        }
        return res;
    }
}
