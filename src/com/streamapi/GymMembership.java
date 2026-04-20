package com.streamapi;

import java.time.LocalDate;
import java.util.*;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return name + " Expiry: " + expiryDate;
    }
}

public class GymMembership {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("Rahul", LocalDate.now().plusDays(10)),
                new Member("Aman", LocalDate.now().plusDays(20))
        );

        members.stream()
                .filter(m -> m.expiryDate.isBefore(LocalDate.now().plusDays(30)))
                .forEach(System.out::println);
    }
}