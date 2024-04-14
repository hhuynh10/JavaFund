import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int lowerBound = 1; // Change this to your desired lower bound
        int upperBound = 1000; // Change this to your desired upper bound

        findAndPrintAmicablePairs(lowerBound, upperBound);

        System.out.println(Arrays.toString(randNumbers(10, 20.0)));
    }

    public static void findAndPrintAmicablePairs(int lower, int upper) {
        for (int a = lower; a <= upper; a++) {
            int b = sumOfProperDivisors(a);
            if (a != b && a < b && sumOfProperDivisors(b) == a) {
                System.out.println(a + " and " + b + " are amicable numbers.");
            }
        }
    }

    public static int sumOfProperDivisors(int num) {
        int sum = 1; // Include 1 as a proper divisor
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum;
    }

    public static double[] randNumbers(int numbers, double range) {
        double[] randNumberList = new double[numbers];
        for (int i = 0; i < randNumberList.length; i++) {
            randNumberList[i] = Math.round((Math.random() * range) * 100.0) / 100.0 + 1;
        }
        return randNumberList;
    }
}
