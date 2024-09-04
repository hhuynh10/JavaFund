package Chapter9.Problem2;

public class Main {
    public static void main(String[] args) {
        Problem stock = new Problem("ORCL", "Oracle Corps", 34.5, 30.0);
        System.out.println("Percent Difference: " + stock.getChangePercent());
    }
}
