import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] arr = {17,3,9,5,12,20,8,15,4,19,11,1,7,16,10,14,6,18,2,13};
        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length-1)));
    }

    public static int[] quickSort(int[] arr, int start, int end){
        if (end <= start) return arr;

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
        return arr;
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start-1;

        for (int j = start; j <= end; j++){
            if (arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
}
