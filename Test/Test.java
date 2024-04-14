import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(intToRoman(1789));
    }

    public static String intToRoman(int num) {
        String[][] symbolList = {
            {"M", "1000"},
            {"CM", "900"},
            {"D", "500"},
            {"CD", "400"},
            {"C", "100"},
            {"XC", "90"},
            {"L", "50"},
            {"XL", "40"},
            {"X", "10"},
            {"IX", "9"},
            {"V", "5"},
            {"IV", "4"},
            {"I", "1"}
        };

        String result = "";
        for (String[] pair : symbolList) {
            String symbol = pair[0];
            int value = Integer.parseInt(pair[1]);
            while (num >= value) {
                result += symbol;
                num -= value;
            }
        }
        return result;
    }
}
