public class Problem {
    public static void main(String[] args){
        int[] arr= {10, 5, 100, 3, 6, 2, 30,};
        System.out.println(evenSumMinusOddProduct(arr));
    }

    public static int evenSumMinusOddProduct(int [] a) {
        int sumEven = 0;
        int oddProduct = 1;
        for (int i = 0; i < a.length; i++){
            if (i % 2 == 0){
                sumEven += a[i];
            } else {
                oddProduct *= a[i];
            }
        }
        return sumEven - oddProduct;
    }
}
