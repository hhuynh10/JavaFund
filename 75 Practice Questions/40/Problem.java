public class Problem {
    public static void main(String[] args){
        System.out.println(isPrime(3));
        System.out.println(isPrime(9));
        System.out.println(isPrime(7));
    }

    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
