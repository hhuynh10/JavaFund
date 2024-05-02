public class Problem {
    public static void main(String[] args){
        int[][] arr = {{5, 3, 0, 0, 2},
                        {0, 10, 10, -5, 8},
                        {1, 0, -5, 10, 7},
                        {1, 3, 4, 0, 0},
                        {1, 0, 6, 4, 1}};
        System.out.println(innerOuter(arr));
    }

    public static int innerOuter(int [][] table) {
        int innerSum = 0;
        int outerSum;
        int total = 0;
        for (int i = 1; i < table.length-1; i++){
            for (int j = 1; j < table.length-1; j++){
                innerSum += table[i][j];
            }
        }
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table.length; j++){
                total += table[i][j];
            }
        }
        outerSum = total - innerSum;
        return outerSum > innerSum ? outerSum : innerSum;
    }
}
