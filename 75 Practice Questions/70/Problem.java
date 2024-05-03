import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibNumbers(0)));
    }

    public static int[] fibNumbers(int n) {
        int[] arr = new int[n + 1];
        if (n == 0){
            arr[0] = 0;
            return arr;
        }
        if (n == 1){
            arr[0] = 0;
            arr[1] = 1;
            return arr;
        }
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }
}
