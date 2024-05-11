import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        char[] a = {'x'};
        char[] b = {'v', 't', 'w', 'p'};

        System.out.println(Arrays.toString(consolidate(a, b)));
    }

    public static char[] consolidate(char[] a, char[] b) {
        char[] result = new char[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length; i += 2) {
            result[index++] = a[i];
        }
        for (int i = 1; i < b.length; i += 2) {
            result[index++] = b[i];
        }
        for (int i = 1; i < a.length; i += 2) {
            result[index++] = a[i];
        }
        for (int i = 0; i < b.length; i += 2) {
            result[index++] = b[i];
        }
        return result;
    }
}
