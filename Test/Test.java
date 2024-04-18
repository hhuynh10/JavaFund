import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        System.out.println(currencyExchange(34, 20, 15, 37));
        
    }

    public static String currencyExchange(int quarters, int dimes, int nickels, int pennies){
        double result = (quarters * 25.0 + dimes * 10.0 + nickels * 5.0 + pennies) / 100;
        double roundedResult = Math.round(result * 100.0) / 100.0;
        return Double.toString(roundedResult);
    }
}

