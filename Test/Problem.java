import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7};
        System.out.println(Arrays.toString(insert(arr, 4, 5)));
    }

    public static int[] insert(int[] arr, int index, int value){
        int[] res = new int[arr.length+1];
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (j == index){
                res[j] = value;
                j++;
            } 
            res[j] = arr[i];
            j++;
        }
        return res;
    }

    public static int[] insert2(int[] arr, int index, int value) {
        // Create a new array with one more element than the original array
        int[] res = new int[arr.length + 1];

        // Copy the elements before the insertion point
        System.arraycopy(arr, 0, res, 0, index);

        // Insert the new value
        res[index] = value;

        // Copy the elements after the insertion point
        System.arraycopy(arr, index, res, index + 1, arr.length - index);

        return res;
    }
}