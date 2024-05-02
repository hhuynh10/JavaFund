public class Problem {
    public static void main(String[] args){
        System.out.println(sumOfDigits(35042));
    }

    public static int sumOfDigits(int n) {
        int result = 0;
        while (n > 0){
            result += (n % 10);
            n /= 10;
        }
        return result;
    }
}
