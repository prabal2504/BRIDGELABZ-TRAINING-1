package com.gla.Interfaces_Assignment_10.Static_Methods_In_Interface;

import java.time.LocalDate;

interface DateUtil {

    static String formatDate(LocalDate date) {
        return date.toString();
    }
}

public class DateUtilityMain {
    public static void main(String[] args) {
        System.out.println(DateUtil.formatDate(LocalDate.now()));
    }
}