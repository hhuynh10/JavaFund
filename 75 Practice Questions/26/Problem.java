public class Problem {
    public static void main(String[] args){
        System.out.println(middleValue(8, 2, 5));
    }

    public static int middleValue(int a, int b, int c) {
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

        return mid;
    }
}
