import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(randNumbers(10, 20.0)));


        int[][] list = {{1, 2, 3}, {7, 8, 9}, {4, 5, 6}};
        System.out.println(highestSum(list));

        System.out.println(geometricProgression(7, 3, 7));
    }



    public static double[] randNumbers(int numbers, double range) {
        double[] randNumberList = new double[numbers];
        for (int i = 0; i < randNumberList.length; i++) {
            randNumberList[i] = Math.round((Math.random() * range) * 10.0) / 10.0 + 1;
        }
        return randNumberList;
    }

    public static String highestSum(int[][] list){
        int max = 0;
        for (int i = 0 ; i < list.length; i++){
            int rowTotal = 0;
            for (int j = 0; j < list[i].length; j++){
                rowTotal += list[i][j];
            }

            max = Math.max(max, rowTotal);
        }

        return Integer.toString(max);
    }

    public static int geometricProgression(int firstTerm, int commonRatio, int numberOfTerms) {
        double sum = firstTerm * (1 - Math.pow(commonRatio, numberOfTerms)) / (1 - commonRatio);
        return (int)sum;
    }
}

