import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        shuffle(a);
    }

    public static void shuffle(int[] a){
        for (int i = 0; i < a.length-1; i++){
            int j = (int) (Math.random() * a.length);

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
