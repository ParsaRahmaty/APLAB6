package com.university;

import java.util.ArrayList;

/**
 * Created by 9731021 on 4/14/2019.
 */
public class Student {

    private String name;
    private String ID;
    private String major;
    private Department department;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name, String ID, String major, Department department) {
        this.name = name;
        this.ID = ID;
        this.major = major;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getMajor() {
        return major;
    }

    public Department getDepartment() {
        return department;
    }

    public Course[] getCourses() {
        Course[] coursesArray = new Course[courses.size()];
        for (int i = 0; i < courses.size(); i++)
            coursesArray[i] = courses.get(i);
        return coursesArray;
    }

    public void addCourse(Course course){
        if (course != null && course.getDepartment() == department)
            courses.add(course);
    }
}

