import java.util.Arrays;

public class Problem {
    public static void main(String[] args){
        System.out.println(Arrays.toString(backAgain(7)));
    }

    public static int[] backAgain(int n){
        int[] arr = new int[2 * n - 1];
        for (int i = 1; i <= arr.length; i++){
            if (i >= n){
                arr[i-1] = n;
                n--;
            } else {
                arr[i-1] = i;
            }
        }
        return arr;
    }
}
