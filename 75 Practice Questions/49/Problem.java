import java.util.Arrays;

public class Problem {
    public static void main(String[] args){
        char[] a ={'x', 'f', 'q'};
        char[] b ={'q', 'f', 'x'};

        System.out.println(areReversed(a, b));
    }

    public static boolean areReversed(char[] a, char[] b) {
        return Arrays.equals(a, reversed(b));
    }

    public static char[] reversed(char[] a){
        int left = 0;
        int right = a.length -1;
        while (left < right){
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return a;
    }
}
