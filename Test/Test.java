import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(baseConversion(43, 16));
    }

    public static String baseConversion(int num, int base){
        String str = "";
        while (num > 0){
            int quotient = num / base;
            int remainder = num % base;
            if (remainder == 10){
                str += "A";
            } else if (remainder == 11){
                str += "B";
            } else if (remainder == 12){
                str += "C";
            } else if (remainder == 13){
                str += "D";
            } else if (remainder == 14){
                str += "E";
            } else if (remainder == 15){
                str += "F";
            } else {
                str += remainder;
            }
            num = quotient;
        }

        String result = "";
        for (int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }
}
