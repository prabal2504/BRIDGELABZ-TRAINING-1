package com.generics;

import java.util.*;

abstract class CourseType {
    String type;

    CourseType(String type) {
        this.type = type;
    }
}

class ExamCourse extends CourseType {
    ExamCourse() {
        super("Exam Based");
    }
}

public class Course<T extends CourseType> {
    T course;

    public void setCourse(T course) {
        this.course = course;
    }

    public void display() {
        System.out.println(course.type);
    }

    public static void main(String[] args) {
        Course<ExamCourse> c = new Course<>();
        c.setCourse(new ExamCourse());
        c.display();
    }
}