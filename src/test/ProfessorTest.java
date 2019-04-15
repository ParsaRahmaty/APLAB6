package test;

import com.university.Professor;
import com.university.Course;
import com.university.Department;
import org.junit.After;
import org.junit.Test;
import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by 9731021 on 4/15/2019.
 */
public class ProfessorTest {
    static Professor professor;
    static Course course;
    static Department department;

    @BeforeClass
    public static void createProfessor() {
        department = new Department("CE");
        professor = new Professor(department, "Bahador Bakhshi");
        course = new Course("1", "WP", department, professor, 1000);
    }

    @Test
    public void testProfessorGetDepartment() {
        assertEquals(department, professor.getDepartment());
    }

    @Test
    public void testProfessorGetName() {
        assertEquals("Bahador Bakhshi", professor.getName());
    }

    @Test
    public void testProfessorGetCourses() {
        assertNotNull(professor.getCourses());
        assertEquals(0, professor.getCourses().length);
    }
}
