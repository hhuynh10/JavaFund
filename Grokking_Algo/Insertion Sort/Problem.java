import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] arr = {17,3,9,5,12,20,8,15,4,19,11,1,7,16,10,14,6,18,2,13};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
}
