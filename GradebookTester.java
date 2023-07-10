/*
 * 
 */
package newLab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradebookTester {

    GradeBook gradeBookObject1, gradeBookObject2;

    @BeforeEach
    public void setUp() throws Exception {
    	gradeBookObject1 = new GradeBook(5);
    	gradeBookObject1.addScore(50.0);
    	gradeBookObject1.addScore(75.0);

    	gradeBookObject2 = new GradeBook(5);
    	gradeBookObject2.addScore(60.0);
    	gradeBookObject2.addScore(80.0);
    	gradeBookObject2.addScore(90.0);
    }

    @AfterEach
    public void tearDown() throws Exception {
    	gradeBookObject1 = null;
    	gradeBookObject2 = null;
    }

    @Test
    public void addScoreTest() {
        assertTrue(gradeBookObject1.toString().equals("50.0 75.0 "));
        assertTrue(gradeBookObject2.toString().equals("60.0 80.0 90.0 "));

        assertEquals(2, gradeBookObject1.getScoreSize(), .0001);
        assertEquals(3, gradeBookObject2.getScoreSize(), .0001);
    }

    @Test
    public void sumTest() {
        assertEquals(125.0, gradeBookObject1.sum(), .0001);
        assertEquals(230.0, gradeBookObject2.sum(), .0001);
    }

    @Test
    public void minTest() {
        assertEquals(50.0, gradeBookObject1.minimum(), .0001);
        assertEquals(60.0, gradeBookObject2.minimum(), .0001);
    }

    @Test
    public void finalScoreTest() {
        assertEquals(75.0, gradeBookObject1.finalScore(), .0001);
        assertEquals(170.0, gradeBookObject2.finalScore(), .0001);
    }
}