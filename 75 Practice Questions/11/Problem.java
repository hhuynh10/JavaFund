public class Problem {
    public static void main (String[] args){
        System.out.println(rangeProduct(3, 6));
    }

    public static int rangeProduct(int a, int b) {
        int product = 1;
        for (int i = a; i <= b; i++){
            product *= i;
        }
        return product;
    }
}
