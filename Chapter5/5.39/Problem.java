public class SalesCommissionCalculator {
    public static void main(String[] args) {
        int baseSalary = 5000;
        int targetSalary = 30000;
        
        // Calculate remaining salary after base salary
        int remainingSalary = targetSalary - baseSalary;
        
        // Initialize total sales amount needed
        double totalSalesAmountNeeded = 0;
        
        // Iterate to find total sales amount needed
        while (remainingSalary > 0) {
            double salesNeeded;
            if (remainingSalary <= 5000 * 0.08) {
                salesNeeded = remainingSalary / 0.08;
            } else if (remainingSalary <= (5000 * 0.08 + 5000 * 0.10)) {
                salesNeeded = (remainingSalary - (5000 * 0.08)) / 0.10 + 5000;
            } else {
                salesNeeded = (remainingSalary - (5000 * 0.08) - (5000 * 0.10)) / 0.12 + 10000;
            }
            totalSalesAmountNeeded += salesNeeded;
            remainingSalary = (int) targetSalary - baseSalary - calculateCommission(totalSalesAmountNeeded);
        }
        
        System.out.println("Total sales amount needed to earn $30,000 a year: " + totalSalesAmountNeeded);
    }
    
    public static double calculateCommission(double salesAmount) {
        if (salesAmount <= 5000) {
            return salesAmount * 0.08;
        } else if (salesAmount <= 10000) {
            return 5000 * 0.08 + (salesAmount - 5000) * 0.10;
        } else {
            return 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
        }
    }
}
