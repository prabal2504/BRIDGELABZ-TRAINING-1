package com.scenario_based;
import java.util.*;

class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }
}

public class LibrarySystem {

    List<Book> books = new ArrayList<>();
    Set<String> members = new HashSet<>();
    Queue<Book> issueQueue = new LinkedList<>();
    Stack<Book> returnedStack = new Stack<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void registerMember(String id) {
        if (members.add(id)) {
            System.out.println("Member added: " + id);
        } else {
            System.out.println("Duplicate member rejected: " + id);
        }
    }

    public void issueBook(Book b) {
        issueQueue.add(b);
    }

    public void processIssue() {
        while (!issueQueue.isEmpty()) {
            System.out.println("Issued: " + issueQueue.poll());
        }
    }

    public void returnBook(Book b) {
        returnedStack.push(b);
    }

    public void reissueLastReturned() {
        if (!returnedStack.isEmpty()) {
            System.out.println("Re-issued: " + returnedStack.pop());
        }
    }

    public static void main(String[] args) {

        LibrarySystem l = new LibrarySystem();

        Book b1 = new Book("Java");
        Book b2 = new Book("Python");

        l.addBook(b1);
        l.addBook(b2);

        l.registerMember("M1");
        l.registerMember("M1"); // duplicate

        l.issueBook(b1);
        l.issueBook(b2);

        l.processIssue();

        l.returnBook(b1);
        l.reissueLastReturned();
    }
}