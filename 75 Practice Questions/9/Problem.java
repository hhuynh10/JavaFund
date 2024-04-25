import java.util.Arrays;

public class Problem {
    public static void main(String[] args){
        int[] arr = {6, 103, 77, 49, 0, 83, 77, 77, 444, 444};
        System.out.println(Arrays.toString(newSmallerArray(arr, 77)));
    }

    public static int[] newSmallerArray(int [] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                count++;
            }
        }

        int index = 0;
        int[] newArr = new int[arr.length - count];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != num){
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }
}
