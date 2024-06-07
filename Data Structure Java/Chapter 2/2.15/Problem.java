import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        double[] x = {0.69, 0.73, 0.76, 0.77, 0.20};
        double[] y = {0.25, 0.83, 0.88, 0.08, 0.88};

        System.out.println(Arrays.deepToString(product(x, y)));
    }

    public static double[][] product(double[] x, double[] y){
        double[][] res = new double[x.length][y.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = x[i] * y[j];
            }
        }
        return res;
    }
}

