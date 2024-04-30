public class Problem {
    public static void main(String[] args){
        System.out.println(glaciered(12, 30));
        System.out.println(glaciered(80, 20));
        System.out.println(glaciered(15, 32));
    }

    public static int glaciered(int k, int m) {
        while (m != 0){
            int temp = m;
            m = k % m;
            k = temp;
        }
        return k;
    }
}
