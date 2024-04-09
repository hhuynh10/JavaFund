import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100001);
        }

        int key = (int) (Math.random() * 101);

        long startTime = System.nanoTime();
        int index = linearSearch(arr, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Linear Search:");
        printResult(index, executionTime);

        // Binary search requires a sorted array
        Arrays.sort(arr);

        int key1 = (int) (Math.random() * 101);

        long startTime1 = System.nanoTime();
        int index1 = binarySearch(arr, key1);
        long endTime1 = System.nanoTime();
        long executionTime1 = endTime1 - startTime1;

        System.out.println("\nBinary Search:");
        printResult(index1, executionTime1);
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key > arr[mid]) {
                low = mid + 1;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void printResult(int index, long executionTime) {
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found.");
        }
        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }
}
