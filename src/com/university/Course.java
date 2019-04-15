package com.university;

import java.util.ArrayList;

/**
 * Created by 9731021 on 4/14/2019.
 */
public class Course {

    private String ID;
    private String name;
    private Department department;
    private Professor professor;
    private int credit;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String ID, String name, Department department, Professor professor, int credit) {
        this.ID = ID;
        this.name = name;
        this.department = department;
        this.professor = professor;
        this.credit = credit;
    }

    public String getID(){
        return ID;
    }

    public Department getDepartment(){
        return department;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        Student[] studentsArray = new Student[students.size()];
        for (int i = 0; i < students.size(); i++)
            studentsArray[i] = students.get(i);
        return studentsArray;
    }

    public Professor getProfessor() {
        return professor;
    }

    public int getCredit() {
        return credit;
    }

    public void enrollStudent(Student student){
        if (student != null && student.getDepartment() == department)
            students.add(student);
    }

}
