package test;

import com.university.Course;
import com.university.Department;
import com.university.Professor;
import com.university.Student;
import org.junit.Test;
import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by 9731021 on 4/14/2019.
 */
 public class CourseTest {
	static Course course;
	static Department department1;
	static Department department2;
	static Professor professor;
	static Student student1;
	static Student student2;
	
	@BeforeClass
	public static void createCourse() {
		department1 = new Department("CE");
		department2 = new Department("CS");
		professor = new Professor(department1, "Bahador Bakhshi");
		student1 = new Student("Parsa", "9731021", "Software Eng", department1);
		student2 = new Student("Alt-Parsa", "-9731021", "Software Eng", department2);
		course = new Course("1", "AP", department1, professor, 1000);
		course.enrollStudent(student1);
	}
	
	@Test
	public void testCourseGetID() {
		assertNotNull(course.getID());
		assertEquals(true, course.getID().equals("1"));
	}
	
	@Test
	public void testCourseGetDepartment() {
		assertNotNull(course.getDepartment());
		assertEquals(department1, course.getDepartment());
	}
	
	@Test
	public void testCourseGetName() {
		assertNotNull(course.getName());
		assertEquals("AP", course.getName());
	}
	
	@Test
	public void testCourseGetProfessor() {
		assertNotNull(course.getProfessor());
		assertEquals(professor, course.getProfessor());
	}
	
	@Test
	public void testCourseEnrollStudent() {
		assertEquals(1, course.getStudents().length);
		assertEquals(student1, course.getStudents()[0]);
		course.enrollStudent(student2);
		assertNotEquals(2, course.getStudents().length);
//		if the size of students does not equal 2, then it means that student2 is not added.
	}
 }