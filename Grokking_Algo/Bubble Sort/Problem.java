import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] arr = {17,3,9,5,12,20,8,15,4,19,11,1,7,16,10,14,6,18,2,13};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
