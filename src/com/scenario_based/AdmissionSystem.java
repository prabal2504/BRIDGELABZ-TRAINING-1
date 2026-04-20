package com.scenario_based;
import java.util.*;

class StudentAdmission {
    String id;
    String name;
    int marks;

    public StudentAdmission(String id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + marks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof StudentAdmission)) return false;
        return this.id.equals(((StudentAdmission)obj).id);
    }
}

public class AdmissionSystem {

    List<StudentAdmission> allApplicants = new ArrayList<>();
    Set<StudentAdmission> shortlisted = new HashSet<>();
    Queue<StudentAdmission> interviewQueue = new LinkedList<>();
    TreeSet<StudentAdmission> meritList =
            new TreeSet<>((a, b) -> b.marks - a.marks);

    public void apply(StudentAdmission s) {
        allApplicants.add(s);
    }

    public void shortlistStudents() {
        shortlisted.addAll(allApplicants);
    }

    public void createInterviewQueue() {
        interviewQueue.addAll(shortlisted);
    }

    public void conductInterviews() {
        while (!interviewQueue.isEmpty()) {
            StudentAdmission s = interviewQueue.poll();
            meritList.add(s);
        }
    }

    public void showMeritList() {
        System.out.println("\n--- FINAL MERIT LIST ---");
        for (StudentAdmission s : meritList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        AdmissionSystem a = new AdmissionSystem();

        a.apply(new StudentAdmission("S1", "Amit", 85));
        a.apply(new StudentAdmission("S2", "Ravi", 90));
        a.apply(new StudentAdmission("S3", "Neha", 80));
        a.apply(new StudentAdmission("S1", "Duplicate Amit", 85));

        a.shortlistStudents();
        a.createInterviewQueue();
        a.conductInterviews();
        a.showMeritList();
    }
}