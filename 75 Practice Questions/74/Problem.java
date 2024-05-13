public class Problem {
    public static void main(String[] args) {
        int[] a = {10, 5, 100, 3, 6, 2, 30, 20};
        System.out.println(sumOfProducts(a));
    }

    public static int sumOfProducts(int [] a) {
        int result = 0;
        for (int i = 0; i < a.length; i += 2){
            if (a.length >= 2 && a.length % 2 == 0){
                result += a[i] * a[i+1];
            }
        }
        return result;
    }
}