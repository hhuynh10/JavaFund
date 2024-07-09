import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] arr = {17,3,9,5,12,20,8,15,4,19,11,1,7,16,10,14,6,18,2,13};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
