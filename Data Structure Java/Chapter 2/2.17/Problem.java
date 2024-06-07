import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        double[][] array = {
            {0.59, 0.38, 0.15},
            {0.42, 0.83, 0.62},
            {0.73, 0.29, 0.90}
        };

        System.out.println(Arrays.deepToString(transpose(array)));
    }

    public static double[][] transpose(double[][] a){
        double[][] tp = new double[a[0].length][a.length];
        for (int i = 0; i < tp.length; i++){
            for (int j = 0; j < tp[i].length; j++){
                tp[i][j] = a[j][i];
            }
        }
        return tp;
    }
}