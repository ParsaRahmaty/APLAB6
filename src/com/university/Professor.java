package com.university;

import java.util.ArrayList;

/**
 * Created by 9731021 on 4/14/2019.
 */
public class Professor {

	private Department department;
	private String name;
	private ArrayList<Course> courses = new ArrayList<>();
	
    public Professor(Department department, String name) {
		this.department = department;
		this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public Course[] getCourses() {
        Course[] coursesArray = new Course[courses.size()];
		for (int i = 0; i < courses.size(); i++)
			coursesArray[i] = courses.get(i);
		return coursesArray;
    }
}
