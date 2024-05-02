import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years, weeks, and days: ");
        int years = input.nextInt();
        int weeks = input.nextInt();
        int days = input.nextInt();
        int totalDays = years * 365 + weeks * 7 + days;
        System.out.printf("%d years, %d weeks, and %d days is the same as %d days.\n", years, weeks, days, totalDays);
    }
}
