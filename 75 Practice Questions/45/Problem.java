public class Problem {
    public static void main(String[] args){
        int[] arr1 = {4, 2, 1, 3, 9};
        int[] arr2 = {10, 0, 11, 44, 19, 46};
        int[] arr3 = {1, 10, -7, 5, 10};

        System.out.println(addEvenSubOdd(arr1));
        System.out.println(addEvenSubOdd(arr2));
        System.out.println(addEvenSubOdd(arr3));
    }

    public static int addEvenSubOdd(int[] a){
        int even = 0;
        int odd = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                even += a[i];
            } else {
                odd += a[i];
            }
        }
        return even - odd;
    }
}
