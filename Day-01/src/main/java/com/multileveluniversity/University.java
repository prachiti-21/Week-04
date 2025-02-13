package com.multileveluniversity;

import java.util.ArrayList;
import java.util.List;

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
