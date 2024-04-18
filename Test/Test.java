import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        System.out.println(passwordCount(6, 10));
        
    }

    public static String passwordCount(int min, int max) {
        BigInteger result = BigInteger.ZERO;
        for (int i = min; i <= max; i++) {
            result = result.add(BigInteger.valueOf((long)Math.pow(68, i)));
        }
        return result.toString();
    }
}

