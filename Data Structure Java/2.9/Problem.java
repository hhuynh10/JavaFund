import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 5};
        System.out.println(Arrays.toString(removeDups(a)));
    }

    public static int[] removeDups(int[] a) {
        if (a.length == 0) return new int[0];
        Arrays.sort(a);
        int uniqueCount = 1; 
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                uniqueCount++;
            }
        }

        int[] arr = new int[uniqueCount];
        arr[0] = a[0];
        int index = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                arr[index] = a[i];
                index++;
            }
        }

        return arr;
    }
}
