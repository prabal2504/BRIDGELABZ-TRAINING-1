package com.generics;

import java.util.*;

abstract class JobRole {
    String role;

    JobRole(String role) {
        this.role = role;
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }
}

public class Resume<T extends JobRole> {
    T jobRole;

    public void setRole(T jobRole) {
        this.jobRole = jobRole;
    }

    public void displayRole() {
        System.out.println(jobRole.role);
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> resume = new Resume<>();
        resume.setRole(new SoftwareEngineer());
        resume.displayRole();
    }
}