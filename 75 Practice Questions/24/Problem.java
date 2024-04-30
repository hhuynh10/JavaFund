public class Problem {
    public static void main(String[] args){
        char[][] sPattern = xPatternArray(11);

        for (int i = 0; i < sPattern.length; i++){
            for (int j = 0; j < sPattern[i].length; j++){
                System.out.printf("%-4c",sPattern[i][j]);
            }
            System.out.println();
        }
    }

    public static char [][] xPatternArray(int n) {
        char[][] sPattern = new char[n][n];
        for (int i = 0 ; i < sPattern.length; i++){
            for (int j = 0 ; j < sPattern[i].length; j++){
                if (i == j){
                    sPattern[i][j] = 'X';
                }
                if (i == sPattern.length - 1 - j){
                    sPattern[i][j] = 'X';
                }
            }
        }
        return sPattern;
    }
}