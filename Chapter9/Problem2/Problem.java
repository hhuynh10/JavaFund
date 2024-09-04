package Chapter9.Problem2;

public class Problem {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Problem(String symbol, String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        double max = Math.max(previousClosingPrice, currentPrice);
        return Math.abs(previousClosingPrice - currentPrice) / max * 100;
    }
}
