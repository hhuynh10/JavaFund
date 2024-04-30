import java.util.Arrays;

public class Problem {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {44, 55, 66, 55, 27};
        System.out.println(Arrays.toString(interleave(arr1, arr2)));
    }

    public static int [] interleave(int [] arr1, int [] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr = new int[len1 + len2];

        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            arr[k++] = arr1[i++];
            arr[k++] = arr2[j++];
        }

        while (i < len1) {
            arr[k++] = arr1[i++];
        }

        while (j < len2) {
            arr[k++] = arr2[j++];
        }

        return arr;
    }
}
