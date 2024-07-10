import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] arr = new int[60];
        float sum = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 2);
            sum += arr[i];
        }

        float prob = (sum / arr.length);
        System.out.println(prob);
    }
}
