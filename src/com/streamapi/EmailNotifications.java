package com.streamapi;

import java.util.*;

public class EmailNotifications {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "user2@gmail.com"
        );

        emails.forEach(email ->
                System.out.println("Notification sent to: " + email)
        );
    }
}