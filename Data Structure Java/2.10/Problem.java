import java.lang.reflect.Array;
import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        reverse(a);
    }

    public static void reverse(int[] a){
        int l = 0;
        int r = a.length-1;
        while (l < r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(a));
    }
}
