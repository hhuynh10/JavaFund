import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(concatenate(a, b)));
    }

    public static int[] concatenate(int[] a, int[] b){
        int[] res = new int[a.length+ b.length];
        int index = 0;
        for (int i = 0; i < a.length; i++){
            res[index] = a[i];
            index++;
        }
        for (int i = 0; i < b.length; i++){
            res[index] = b[i];
            index++;
        }

        return res;
    }
}