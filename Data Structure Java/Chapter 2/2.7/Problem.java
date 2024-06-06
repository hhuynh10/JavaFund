public class Problem {
    public static void main(String[] args) {
        int[] a = {180, 5, 3, 9, 5, 10};

        System.out.println(minimum(a));
    }

    public static int minimum(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            min = Math.min(min, a[i]);
        }
        return min;
    }
}
