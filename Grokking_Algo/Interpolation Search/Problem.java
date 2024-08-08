public class Problem {
    public static void main(String[] args) {
        int[] list = {1, 4, 7, 2, 9};
        System.out.println(interpolationSearch(list, 9));
    }

    public static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
    
        while (low <= high && target >= arr[low] && target <= arr[high]) {    
            int probe = low + (high - low) * (target - arr[low]) / (arr[high] - arr[low]);

            if (arr[probe] < target) {
                low = probe + 1;
            } else if (arr[probe] > target) {
                high = probe - 1;
            } else {
                return probe;
            }
        }
        return -1;
    }
}
