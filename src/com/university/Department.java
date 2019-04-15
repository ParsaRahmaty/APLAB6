package com.university;

import java.util.ArrayList;

/**
 * Created by 9731021 on 4/14/2019.
 */
public class Department {

	private String name;
	private ArrayList<Student> students = new ArrayList<>();
	private ArrayList<Course> courses = new ArrayList<>();
	private ArrayList<Professor> professors = new ArrayList<>();

    public Department(String name) {
		this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addStudent(Student student){
		if (student != null)
			students.add(student);
    }

    public Student[] getStudents(){
        Student[] studentsArray = new Student[students.size()];
        for (int i = 0; i < students.size(); i++)
            studentsArray[i] = students.get(i);
        return studentsArray;
    }

    public void removeStudent(Student student){
		if (students.contains(student))
			students.remove(student);
    }

    public void addCourse(Course course){
		if (course != null)
			courses.add(course);
    }

    public Course[] getCourses(){
        Course[] coursesArray = new Course[courses.size()];
        for (int i = 0; i < courses.size(); i++)
            coursesArray[i] = courses.get(i);
        return coursesArray;
    }

    public void removeCourse(Course course){
		if (courses.contains(course))
			courses.remove(course);
    }

    public void addProfessor(Professor professor){
		if (professor != null)
			professors.add(professor);
    }

    public Professor[] getProfessors(){
        Professor[] professorsArray = new Professor[professors.size()];
		for (int i = 0; i < professors.size(); i++)
			professorsArray[i] = professors.get(i);
		return professorsArray;
    }

    public void removeProfessor(Professor professor){
		if (professors.contains(professor))
			professors.remove(professors);
    }

}
