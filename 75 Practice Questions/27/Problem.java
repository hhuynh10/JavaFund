public class Problem {
    public static void main(String[] args) {
        int[] arr1 = {3, 8, 17, 25, 89, 94};
        int[] arr2 = {77, 66, 43, 33, 22, 11};
        int[] arr3 = {20, 30, 50, 40, 10, 5};
        int[] arr4 = {20, 30, 50, 50, 70, 90};

        System.out.println(goingWhichWay(arr1));
        System.out.println(goingWhichWay(arr2));
        System.out.println(goingWhichWay(arr3));
        System.out.println(goingWhichWay(arr4));
    }

    public static int goingWhichWay(int[] myArray) {
        if (isIncreasing(myArray)) {
            System.out.println("INCREASING");
            return 111;
        } else if (isDecreasing(myArray)) {
            System.out.println("DECREASING");
            return 222;
        } else {
            System.out.println("NEITHER");
            return 333;
        }
    }

    public static boolean isIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1] || arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1] || arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
