public class Problem {
    public static void main(String[] args) {
        int[][] arr = {{40, 0, 10, 5, 0},
                        {1, 2, 1, 4, 7},
                        {3, 2, 5, 0, 20},
                        {6, 10, 9, 4, 8},
                        {0, 20, 0, 5, 0}};
        System.out.println(sumTarget(arr, 50));
    }

    public static int sumTarget (int [][] table, int target) {
        for (int i = 0; i < table.length; i++){
            int sum = 0;
            for (int j = 0; j < table[i].length; j++){
                sum += table[i][j];
                if (i != j){
                    sum += table[j][i];
                }
            }
            if (sum == target){
                return i;
            }
        }
        return -1;
    }
}
