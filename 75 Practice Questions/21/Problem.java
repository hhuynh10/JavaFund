public class Problem {
    public static void main(String[] args){
        System.out.println(isLeapYear(1800));
    }

    public static boolean isLeapYear(int y) {
        return (y % 4 == 0) && ((y % 100 != 0) || (y % 400 == 0));
    }
}
