package com.lambdaexamples;

import java.util.*;
import java.util.stream.Collectors;

public class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice for Transaction ID: " + transactionId;
    }

    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList(
                "TXN101", "TXN102", "TXN103"
        );

        // Constructor Reference
        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}