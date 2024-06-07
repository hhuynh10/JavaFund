public class Problem {
    public static void main(String[] args) {
        double[] x = {0.69,0.73,0.76,0.77,0.20};
        double[] y = {0.25,0.83,0.88,0.08,0.88};
        System.out.println(innerProduct(x, y));
    }

    public static double innerProduct(double[] x, double[] y){
        double product = 0;
        int index = 0;
        int minLength = Math.max(x.length, y.length);

        for (int i = 0; i < minLength; i++){
            if (index > x.length-1){
                product += y[index];
            } else if (index > y.length-1){
                product += x[index];
            } else {
                product += y[index] * x[index];
            }
            index++;
        }
        return product;
    }
}
