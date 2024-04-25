public class Problem {
    public static void main(String[] args){
        int[] arr1 = {6, 8, 15, 22, 77, 93, 98};
        int[] arr2 = {5, 15, 22, 44, 93};

        System.out.println(howManyInCommon(arr1, arr2));
    }

    public static int howManyInCommon(int [] arr1, int [] arr2) {
        if (arr1.length == 0 || arr2.length == 0){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] == binarySearch(arr2, arr1[i])){
                count++;
            }
        }
        return count;
    }

    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            if (key > arr[mid]){
                low = mid + 1;
            } else if (key < arr[mid]){
                high = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return 0;
    }
}