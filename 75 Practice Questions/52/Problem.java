public class Problem {
    public static void main(String[] args){
        int[][] arr = {{50, 20, 80, 90, 100},
                    {77, 555, 33, 44, 66},
                    {888, 15, 302, 90, 123},
                    {31, 29, 30, 32, 28}};

        System.out.println(maxOfMins(arr));
    }

    public static int maxOfMins(int [][] table) {
        int min = 0;
        for (int i = 0; i < table[0].length; i++){
            min += table[0][i]; 
        }
        
        int minRow = 0;
        for (int i = 0; i < table.length; i++){
            int sum = 0;
            for (int j = 0; j < table[i].length; j++){
                sum += table[i][j];
            }
            if (sum < min){
                min = sum;
                minRow = i;
            }
        }

        int max = table[minRow][0];
        for (int i = 0; i < table[minRow].length; i++){
            max = Math.max(max, table[minRow][i]);
        }
        return max;
    }
}
