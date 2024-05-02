public class Problem {
    public static void main(String[] args){
        System.out.println(highestPow(30));
        System.out.println(highestPow(107));
        System.out.println(highestPow(36));
        System.out.println(highestPow(80));
        System.out.println(highestPow(40));
    }

    public static int highestPow(int n) {
        if (n % 2 != 0){
            return 1;
        }

        int result = 0;
        for (int i = 2; i < n; i *= 2){
            if (n % i == 0){
                result = i;
            }
        }
        return result;
    }
}
