class Account {
    protected int accountNumber;
    protected double balance;
    protected static String bankName = "APKA APNA Bank";
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double calculateInterest() {
        return 0;
    }
}
class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02;
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount(101, 10000);
        Account acc2 = new CurrentAccount(102, 10000);

        System.out.println("Bank Name: " + Account.bankName);

        System.out.println("Savings Interest: " + acc1.calculateInterest());
        System.out.println("Current Interest: " + acc2.calculateInterest());
    }
}