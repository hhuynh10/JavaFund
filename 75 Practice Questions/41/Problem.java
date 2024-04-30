public class Problem {
    public static void main(String[] args){
        int[] a = {4, 2, 1, 3, 9};
        int[] b = {10, 2, 13, 43, 19, 42};
        int[] c =  {1, 10, -7, 5, 10};

        System.out.println(elementsBiggerThan(a, 0));
        System.out.println(elementsBiggerThan(b, 40));
        System.out.println(elementsBiggerThan(c, 10));
    }

    public static int elementsBiggerThan(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > n){
                count++;
            }
        }
        return count;
    }
}