import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {



        int[][] list = {{1, 2, 3}, {7, 8, 9}, {4, 5, 6}};
        System.out.println(highestSum(list));

        int[][] arr = listGenerator(10, 500);
        for (int i = 0; i < arr.length; i++){
            for (int j = 0 ; j< arr.length; j++){
                System.out.printf("%-6d", arr[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] listGenerator(int numbers, int range) {
        int[][] randNumberList = new int[numbers][numbers];
        for (int i = 0; i < randNumberList.length; i++) {
            for (int j = 0; j < randNumberList[i].length; j++) {
                randNumberList[i][j] = (int) (Math.random() * range) + 1;
            }
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
}

