package test;

import com.university.Course;
import com.university.Department;
import com.university.Professor;
import com.university.Student;
import org.junit.After;
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
    static Student student3;
	static Course course1;
	static Course course2;
    static Course course3;
	static Professor professor1;
	static Professor professor2;
    static Professor professor3;
	static Department department1;
	static Department department2;

    @After
    public void flushLists() {
        department1 = new Department("CE");
        department2 = new Department("CS");
    }

	@BeforeClass
	public static void createDepartment() {
		department1 = new Department("CE");
		department2 = new Department("CS");
		professor1 = new Professor(department1, "Bahador Bakhshi");
		professor2 = new Professor(department2, "Anonymous");
        professor3 = new Professor(department1, "Fallah");
		student1 = new Student("Parsa", "9731021", "Software Eng", department1);
		student2 = new Student("Alt-Parsa", "-9731021", "Software Eng", department2);
        student3 = new Student("MR Dorudian", "9731018", "Software Eng", department1);
		course1 = new Course("1", "AP", department1, professor1, 1000);
		course2 = new Course("2", "NP", department2, professor2, 2000);
        course3 = new Course("3", "AP", department1, professor1, 3000);
	}

	@Test
	public void testDepartmentGetStudents() {
        assertNotNull(department1.getStudents());
        assertEquals(0, department1.getStudents().length);
	}

    @Test
    public void testDepartmentAddStudent1() {
        department1.addStudent(student2);
        assertEquals(0, department1.getStudents().length);
    }

    @Test
    public void testDepartmentAddStudent2() {
        department1.addStudent(student1);
        assertEquals(student1, department1.getStudents()[0]);
    }

    @Test
    public void testDepartmentRemoveStudent1() {
        department1.addStudent(student1);
        department1.removeStudent(student2);
        assertEquals(student1, department1.getStudents()[0]);
    }

    @Test
    public void testDepartmentRemoveStudent2() {
        department1.addStudent(student1);
        department1.removeStudent(student3);
        assertEquals(student1, department1.getStudents()[0]);
        department1.removeStudent(student1);
        assertEquals(0, department1.getStudents().length);
    }

    @Test
    public void testDepartmentGetName() {
        assertEquals(true, department1.getName().equals("CE"));
        assertEquals(true, department2.getName().equals("CS"));
    }

    @Test
    public void testDepartmentGetCourses() {
        assertNotNull(department1.getCourses());
        assertEquals(0, department1.getCourses().length);
    }

    @Test
    public void testDepartmentAddCourse1() {
        department1.addCourse(course2);
        assertEquals(0, department1.getCourses().length);
    }

    @Test
    public void testDepartmentAddCourse2() {
        department1.addCourse(course1);
        assertEquals(course1, department1.getCourses()[0]);
    }

    @Test
    public void testDepartmentRemoveCourse1() {
        department1.addCourse(course1);
        department1.removeCourse(course2);
        assertEquals(course1, department1.getCourses()[0]);
    }

    @Test
    public void testDepartmentRemoveCourse2() {
        department1.addCourse(course1);
        department1.removeCourse(course3);
        assertEquals(course1, department1.getCourses()[0]);
        department1.removeCourse(course1);
        assertEquals(0, department1.getCourses().length);
    }

    @Test
    public void testDepartmentGetProfessor() {
        assertNotNull(department1.getProfessors());
        assertEquals(0, department1.getProfessors().length);
    }

    @Test
    public void testDepartmentAddProfessor1() {
        department1.addProfessor(professor2);
        assertEquals(0, department1.getProfessors().length);
    }

    @Test
    public void testDepartmentAddProfessor2() {
        department1.addProfessor(professor1);
        assertEquals(professor1, department1.getProfessors()[0]);
    }

    @Test
    public void testDepartmentRemoveProfessor() {
        department1.addProfessor(professor1);
        department1.removeProfessor(professor3);
        assertEquals(professor1, department1.getProfessors()[0]);
        department1.removeProfessor(professor1);
        assertEquals(0, department1.getProfessors().length);
    }
 }