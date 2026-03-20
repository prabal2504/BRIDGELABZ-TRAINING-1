package com.gla.Interfaces_Assignment_10.Static_Methods_In_Interface;

interface SecurityUtils {

    static boolean checkPassword(String password) {
        return password.length() >= 8;
    }
}

public class SecurityUtilsMain {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.checkPassword("java1234"));
    }
}