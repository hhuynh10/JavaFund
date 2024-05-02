public class Problem {
    public static void main(String[] args){
        int[][] arr = {{5, 3, 0, 0, 2, 2},
                        {0, 10, 0, -5, 8, 0},
                        {1, 0, -5, 10, 7, 7},
                        {1, 3, 4, 0, 0, 0},
                        {1, 0, 6, 4, 1, 1}};
        
        System.out.println(rowWithMostZeros(arr));
    }

    public static int rowWithMostZeros (int [][] table) {
        int maxZeroCount = 0; 
        int rowIndex = -1; 
        
        for (int i = 0; i < table.length; i++){
            int count0 = 0; 
            for (int j = 0; j < table[i].length; j++){
                if (table[i][j] == 0){
                    count0++;
                }
            }
            if (count0 >= maxZeroCount){
                maxZeroCount = count0;
                rowIndex = i;
            }
        }
        return rowIndex;
    }
}

