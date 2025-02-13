package com.multileveluniversity;

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " (Research-Based) is evaluated through research projects.");
    }
}
