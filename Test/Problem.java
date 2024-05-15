public class Problem {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }

    public int reverse(int x) {
        x = Integer.toString(x);
        
        return Integer.parseInt(x);
    }
}