package com.multileveluniversity;

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " (Assignment-Based) is evaluated through assignments.");
    }
}
