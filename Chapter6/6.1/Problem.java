//import API's needed here:

public class Problem 
{  
    public static void main(String[] args) 
    {
        int numOfPentagonal = 100;
        int intPerLine = 10;
        int count = 0;

        for (int i = 1; i <= numOfPentagonal; i++){
            int pentagonalNumber = getPentagonalNumber(i);
            System.out.printf("%7d", pentagonalNumber);
            count++;
            if (count % intPerLine == 0){
                System.out.println();
            }
        }

    } //closing main method

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
} //closing class header

