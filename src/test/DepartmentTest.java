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
 public class DepartmentTest {
	static Student student1;
	static Student student2;
	static Course course1;
	static Course course2;
	static Professor professor1;
	static Professor professor2;
	static Department department1;
	static Department department2;
	
	@BeforeClass
	public static void createDepartment() {
		department1 = new Department("CE");
		department2 = new Department("CS");
		professor1 = new Professor(department1, "Bahador Bakhshi");
		professor2 = new Professor(department2, "Anonymous");
		student1 = new Student("Parsa", "9731021", "Software Eng", department1);
		student2 = new Student("Alt-Parsa", "-9731021", "Software Eng", department2);
		course1 = new Course("1", "AP", department1, professor1, 1000);
		course2 = new Course("2", "NP", department2, professor2, 2000);
	}

//	@Test
//	public void
 }