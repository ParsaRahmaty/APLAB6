package test;

import com.university.Course;
import com.university.Department;
import com.university.Professor;
import com.university.Student;
import org.junit.Test;
import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by 9731021 on 4/14/2019.
 */
public class StudentTest {
    static Student student;
    static Department department;
    static Course course;
    static Professor professor;

    @BeforeClass
    public static void createStudent() {
        department = new Department("Computer and IT Eng");
        student = new Student("Alireza", "1234", "Software Eng", department);
        professor = new Professor(department, "Bahador Bakhshi");
        course = new Course("1", "AP", department, professor, 1000);
    }

    @Test
    public void testStudentGetName() {
        assertEquals("Alireza", student.getName());
    }

    @Test
    public void testStudenGetCourses() {
        assertNotNull(student.getCourses());
        assertEquals(0, student.getCourses().length);
    }

    @Test
    public void testStudentGetID() {
        assertNotNull(student.getID());
        assertEquals("1234", student.getID());
    }

    @Test
    public void testStudentGetDepartment() {
        assertNotNull(student.getDepartment());
        assertEquals(department, student.getDepartment());
    }

    @Test
    public void testStudentGetMajor() {
        assertNotNull(student.getMajor());
        assertEquals("Software Eng", student.getMajor());
    }

    @Test
    public void testStudentAddCourse() {
        student.addCourse(course);
        Course[] courses = new Course[1];
        courses[0] = course;
        assertEquals(1, student.getCourses().length);
		assertEquals(student.getCourses(), courses);
		student.addCourse(null);
		assertEquals(1, student.getCourses().length);
    }
}

