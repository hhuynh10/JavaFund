public class Problem {
    public static void main(String[] args) {
        double[] a = {0.19, 0.49, 0.58, 0.76, 0.29, 0.87, 0.49, 0.65, 0.74, 0.18};
        System.out.println(mean(a));
    }

    public static double mean(double[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }

        double avg = (double)(sum / a.length);
        return avg;
    }
}
