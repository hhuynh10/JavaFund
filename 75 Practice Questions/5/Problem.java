public class Problem {
    public static void main(String[] args){
        int[] arr1 = {55, 33, 22};
        int[] arr2 = {7, 6, 55, 33, 22, 1};
        int[] arr3 = {5, 2, 3};
        int[] arr4 = {5, 66, 44, 2, 3, 1};

        System.out.println(appearsConsecutively(arr1, arr2));
        System.out.println(appearsConsecutively(arr3, arr4));
    }

    public static boolean appearsConsecutively(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == arr1[j]) {
                j++;
            } else {
                j = 0;
            }

            if (j == arr1.length) {
                return true;
            }
        }
        return false;
    }
}
