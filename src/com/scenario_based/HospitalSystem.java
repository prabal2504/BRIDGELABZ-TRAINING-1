package com.scenario_based;
import java.util.*;

class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public int hashCode() {
        return name.hashCode();
    }

    public boolean equals(Object o) {
        return name.equals(((Patient)o).name);
    }
}

public class HospitalSystem {

    Set<Patient> admitted = new HashSet<>();
    Queue<Patient> waiting = new LinkedList<>();
    Stack<Patient> discharged = new Stack<>();
    List<Patient> history = new ArrayList<>();

    public void admit(Patient p) {
        if (admitted.add(p)) {
            waiting.add(p);
        }
    }

    public void treat() {
        while (!waiting.isEmpty()) {
            Patient p = waiting.poll();
            discharged.push(p);
            history.add(p);
        }
    }

    public static void main(String[] args) {

        HospitalSystem h = new HospitalSystem();

        h.admit(new Patient("Amit"));
        h.admit(new Patient("Ravi"));
        h.admit(new Patient("Amit"));

        h.treat();

        System.out.println("History: " + h.history);
    }
}