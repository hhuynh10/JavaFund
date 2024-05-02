public class Problem {
    public static void main(String[] args){
        int[] a = {10, 5, 100, 20, 15, 33, 29, 20};
        System.out.println(firstSquare(a));
    }

    public static int firstSquare(int [] a) {
        int result = 0;
        boolean found = false;
        for (int i = 0; i < a.length; i++){
            if (!found){
                if (a[i] < Math.pow(i, 2)){
                    result = i;
                    found = true;
                }
            }
        }
        return result;
    }
}
