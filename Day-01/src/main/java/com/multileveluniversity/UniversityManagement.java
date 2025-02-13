package com.multileveluniversity;

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
}
