import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[][] a = {{3, 6, 7, 2}, {1, 0, 5, 9}};
        int[][] b = {{31, 3, 17}, { 7, 40, 5}, {12, 8, 89}};

        System.out.println(Arrays.deepToString(switchColumns(a, 0, 3)));
        System.out.println(Arrays.deepToString(switchColumns(b, 2, 1)));
    }

    public static int[][] switchColumns(int[][] a, int x, int y) {
        for (int i = 0; i < a.length; i++){
            int temp = a[i][x];
            a[i][x] = a[i][y];
            a[i][y] = temp;
        }
        return a;
    }
}
