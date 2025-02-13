package com.multileveluniversity;

import com.multileveluniversity.*;
import java.util.ArrayList;
import java.util.List;

// Abstract class representing different types of courses
abstract class CourseType {
    protected String courseName;
    protected String department;

    public CourseType(String courseName, String department) {
        this.courseName = courseName;
        this.department = department;
    }

    public abstract void evaluate();

    public String getCourseName() {
        return courseName;
    }

    public String getDepartment() {
        return department;
    }
}

// Concrete course types
/*class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " (Exam-Based) is evaluated through written exams.");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " (Assignment-Based) is evaluated through assignments.");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " (Research-Based) is evaluated through research projects.");
    }
}

// Generic class for courses
class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void showDetails() {
        System.out.println("Course: " + courseType.getCourseName() + " | Department: " + courseType.getDepartment());
        courseType.evaluate();
    }

    public T getCourseType() {
        return courseType;
    }
}

// University class to manage courses dynamically using wildcards
class University {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void showAllCourses() {
        for (Course<? extends CourseType> course : courses) {
            course.showDetails();
            System.out.println("-----------------------------");
        }
    }
}

// Main class to demonstrate functionality
public class UniversityManagement {
    public static void main(String[] args) {
        University university = new University();

        // Creating different courses
        Course<ExamCourse> mathCourse = new Course<>(new ExamCourse("Mathematics", "Science"));
        Course<AssignmentCourse> csCourse = new Course<>(new AssignmentCourse("Programming", "Computer Science"));
        Course<ResearchCourse> aiCourse = new Course<>(new ResearchCourse("Artificial Intelligence", "AI & Data Science"));

        // Adding courses to university
        university.addCourse(mathCourse);
        university.addCourse(csCourse);
        university.addCourse(aiCourse);

        // Displaying all courses
        university.showAllCourses();
    }
}*/
