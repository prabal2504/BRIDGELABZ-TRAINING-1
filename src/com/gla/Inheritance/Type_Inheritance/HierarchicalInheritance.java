package com.gla.Type_Inheritance;

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int tenure;

    FixedDepositAccount(int accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, 50000, 5.5);
        CheckingAccount c = new CheckingAccount(102, 30000, 10000);
        FixedDepositAccount f = new FixedDepositAccount(103, 100000, 12);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}
