import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] arr = {17,3,9,5,12,20,8,15,4,19,11,1,7,16,10,14,6,18,2,13};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr){
        if (arr.length <= 1) return arr;

        int len = arr.length;
        int mid = len / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[len-mid];

        int i = 0;
        int j = 0;
        for (; i < len; i++){
            if (i < mid){
                leftArr[i] = arr[i];
            } else {
                rightArr[j] = arr[i];
                j++;
            }
        }

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
        return arr;
    }

    public static int[] merge(int[] leftArr, int[] rightArr, int[] arr){
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize){
            if (leftArr[l] < rightArr[r]){
                arr[i] = leftArr[l];
                i++;
                l++;
            } else {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while (l < leftSize){
            arr[i] = leftArr[l];
            i++;
            l++;
        }
        while (r < rightSize){
            arr[i] = rightArr[r];
            i++;
            r++;
        }
        return arr;
    }
}
