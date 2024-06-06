import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 5, 4};

        System.out.println(isSorted(a));
        System.out.println(isSorted(b));
    }

    public static boolean isSorted(int[] a){
        for (int i = 1; i < a.length; i++){
            if (a[i] < a[i-1]){
                return false;
            }
        }
        return true;
    }
}
