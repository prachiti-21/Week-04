package com.multileveluniversity;

class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " (Exam-Based) is evaluated through written exams.");
    }
}
