public class Problem {
    public static void main(String[] args){
        System.out.println(atLeastThreeMatch(4, 2, 3, 3));
    }

    public static boolean atLeastThreeMatch(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        for (int i = 0; i < arr.length; i++){
            int count = 1;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(count);
            if (count >= 3){
                return true;
            }
        }
        return false;
    }
}
