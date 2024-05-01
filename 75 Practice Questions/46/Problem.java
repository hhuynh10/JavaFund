public class Problem {
    public static void main(String[] args){
        int[][] arr = {{3, 6, 7, 2},{1, 0, 5, 9}} ;
        int[][] newArr = removeColumn(arr, 2);

        for (int i = 0; i < newArr.length; i++){
            for (int j = 0; j < newArr[i].length; j++){
                System.out.printf("%-4d", newArr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] removeColumn(int[][] a, int x) {
        if (x >= a[0].length){
            return a;
        }

        int[][] newArr = new int[a.length][a[0].length - 1];
        for (int i = 0; i < a.length; i++){
            int k = 0;
            for (int j = 0; j < a[i].length; j++){
                if (j != x){
                    newArr[i][k] = a[i][j];
                    k++;
                }
            }
        }
        return newArr;
    }
}
