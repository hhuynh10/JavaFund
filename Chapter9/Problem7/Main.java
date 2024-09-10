package Chapter9.Problem7;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000.00, 4.5);

        account.withdraw(2500);
        System.out.println("Balance: " + account.getBalance());

        account.deposit(3000);
        System.out.println("Balance: " + account.getBalance());

        System.out.println("ID: " + account.getId());
        System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate());
        System.out.println("Monthly Interest Rate: " + account.getMonthlyInterestRate());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
    }
}
