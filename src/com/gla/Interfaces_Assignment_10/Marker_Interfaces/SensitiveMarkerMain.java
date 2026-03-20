package com.gla.Interfaces_Assignment_10.Marker_Interfaces;

interface SensitiveData { }

class Account implements SensitiveData {
    String password = "12345";
}

public class SensitiveMarkerMain {
    public static void main(String[] args) {

        Account acc = new Account();

        if(acc instanceof SensitiveData)
            System.out.println("Encrypt this data");
        else
            System.out.println("Normal data");
    }
}