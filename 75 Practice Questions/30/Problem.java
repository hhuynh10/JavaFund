import java.util.Arrays;

public class Problem {
    public static void main(String[] args){
        System.out.println(Arrays.toString(createNewArray(8, 5, 4)));
    }

    public static int [] createNewArray(int size, int start, int increment) {
        int[] arr = new int[size];
        arr[0] = start;
        for (int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + increment;
        }
        return arr;
    }
}
