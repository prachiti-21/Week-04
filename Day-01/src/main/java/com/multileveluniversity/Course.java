package com.multileveluniversity;

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

