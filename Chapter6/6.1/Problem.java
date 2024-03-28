//import API's needed here:

public class Problem 
{  
    public static void main(String[] args) 
    {
        int NUM_OF_PENT = 100;
        int NUM_PER_LINE = 10;
        int count = 0;

        for (int i = 1; i <= NUM_OF_PENT; i++){
            int pentagonalNumber = getPentagonalNumber(i);
            System.out.printf("%7d", pentagonalNumber);
            count++;
            if (count % NUM_PER_LINE == 0){
                System.out.println();
            }
        }

    } //closing main method

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
} //closing class header

