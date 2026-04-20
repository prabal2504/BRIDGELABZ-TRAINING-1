package com.lambdaexamples;

import java.util.*;
import java.util.function.Predicate;

public class HospitalAlerts {
    public static void main(String[] args) {

        List<String> alerts = Arrays.asList(
                "Emergency Alert",
                "Medicine Reminder",
                "Appointment Alert",
                "General Notification"
        );

        // Filter only alerts containing "Alert"
        Predicate<String> importantAlerts =
                alert -> alert.contains("Alert");

        alerts.stream()
                .filter(importantAlerts)
                .forEach(System.out::println);
    }
}