package com.scenario_based;
import java.util.*;

public class ExamSystem {

    List<String> questions = new ArrayList<>();
    Set<Student> students = new HashSet<>();
    Queue<Student> examQueue = new LinkedList<>();
    Stack<String> questionStack = new Stack<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addQuestions() {
        questions.add("Q1");
        questions.add("Q2");
        questions.add("Q3");
    }

    public void startExam() {
        examQueue.addAll(students);

        while (!examQueue.isEmpty()) {
            Student s = examQueue.poll();
            System.out.println("Exam for: " + s);

            for (String q : questions) {
                questionStack.push(q);
                System.out.println("Question: " + questionStack.peek());
            }
        }
    }

    public static void main(String[] args) {

        ExamSystem e = new ExamSystem();

        e.addStudent(new Student("S1", "Amit"));
        e.addStudent(new Student("S2", "Ravi"));
        e.addStudent(new Student("S1", "Duplicate"));

        e.addQuestions();
        e.startExam();
    }
}
