public class Problem {
    public static void main(String[] args){
        System.out.println(isPerfect(20));
    }

    public static boolean isPerfect(int n) {
        int sumFactor = 0;
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                sumFactor += i;
            }
        }
        return sumFactor <= n;
    }
}
