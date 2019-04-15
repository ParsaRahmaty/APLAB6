package test;

import com.university.Department;
import org.junit.After;
import org.junit.Test;
import org.junit.BeforeClass;
import com.university.University;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;


/**
 * Created by 9731021 on 4/15/2019.
 */
public class UniversityTest {
    static University university;
    static Department department1;
    static Department department2;

    @BeforeClass
    public static void createUniversity() {
        university = new University();
        department1 = new Department("CE");
        department2 = new Department("CS");
    }

    @After
    public void flushUniversity() {
        university = new University();
    }

    @Test
    public void testUniversityGetDepartments() {
        assertNotNull(university.getDepartments());
        assertEquals(0, university.getDepartments().length);
    }

    @Test
    public void testUniversityAddDepartment() {
        university.addDepartment(department1);
        assertEquals(department1, university.getDepartments()[0]);
    }

    @Test
    public void testUniversityRemoveDepartment() {
        university.addDepartment(department1);
        university.removeDepartment(department2);
        assertEquals(department1, university.getDepartments()[0]);
        university.removeDepartment(department1);
        assertEquals(0, university.getDepartments().length);
    }
}
