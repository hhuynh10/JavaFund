public class Problem {
    public static void main(String[] args){
        System.out.println(canFormRightTriangle(3, 4, 5));
        System.out.println(canFormRightTriangle(6, 10, 8));
        System.out.println(canFormRightTriangle(12, 5, 13));
        System.out.println(canFormRightTriangle(3, -4, 5));
        System.out.println(canFormRightTriangle(0, 0, 0));
        System.out.println(canFormRightTriangle(1, 2, 3));
    }

    public static boolean canFormRightTriangle(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int mid;
        if (a != max && a != min){
            mid = a;
        } else if (b != max && b != min){
            mid = b;
        } else {
            mid = c;
        }

        return ((max > 0 && mid > 0 && min > 0) && (Math.pow(max, 2) == Math.pow(mid, 2) + Math.pow(min, 2)));
    }
}
