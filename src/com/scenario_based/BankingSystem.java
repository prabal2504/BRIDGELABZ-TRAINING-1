package com.scenario_based;

import java.util.*;

class Transaction {
    String acc;
    double amount;

    public Transaction(String acc, double amount) {
        this.acc = acc;
        this.amount = amount;
    }
}

public class BankingSystem {

    List<Transaction> allTransactions = new ArrayList<>();
    Queue<Transaction> pending = new LinkedList<>();
    Set<String> validAccounts = new HashSet<>();
    Stack<Transaction> rollback = new Stack<>();

    public static void main(String[] args) {

        BankingSystem b = new BankingSystem();

        b.validAccounts.add("A1");
        b.validAccounts.add("A2");

        Transaction t1 = new Transaction("A1", 1000);
        Transaction t2 = new Transaction("A2", 2000);

        b.pending.add(t1);
        b.pending.add(t2);

        while (!b.pending.isEmpty()) {
            Transaction t = b.pending.poll();

            if (b.validAccounts.contains(t.acc)) {
                System.out.println("Processed: " + t.acc);
                b.allTransactions.add(t);
                b.rollback.push(t);
            }
        }

        System.out.println("Last rollback: " + b.rollback.pop().acc);
    }
}