package edu.isu.cs.cs2263.hw02.data;
import edu.isu.cs.cs2263.hw02.App;
import edu.isu.cs.cs2263.hw02.data.Course;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Log4j2
public class CourseTest {
    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(App.class);

    Course testCourse = new Course("test","1234",1234,4);

    /**
     * Ensures that get number returns the proper values
     */
    @Test
    public void test_GetNumber() {
        Course testCourse = new Course("test", "1234", 1234, 4);
        assertEquals(1234, testCourse.getNumber());
        logger.info("Passed");
    }

    /**
     * Ensures getName returns the correct string
     */

    public void test_getName() {
        assertEquals("test", testCourse.getName());
    }

    /**
     * Ensures getCredits returns the correct integer
     */

    @Test
    public void test_getCredits() {
        assertEquals(4, testCourse.getCredits());
    }

    /**
     * Ensures getCode returns the correct string
     */

    @Test
    public void test_getCode(){
        assertEquals("1234",testCourse.getCode());
    }

    /**
     * Ensures setName returns the correct string
     */
    @Test
    public void test_setName() {
        testCourse.setName("tested");
        assertEquals("tested", testCourse.getName());
    }

    /**
     * Ensures testnumber returns the correct number
     */

    @Test
    public void test_setNumber() {
        testCourse.setNumber(4321);
        assertEquals(4321, testCourse.getNumber());
    }
    /**
     * Ensures setCredits returns the correct integer
     */

    @Test
    public void test_set_Credits() {
        testCourse.setCredits(0);
        assertEquals(0, testCourse.getCredits());
    }

    /**
     * Ensures setCode returns the correct string
     */

    @Test
    public void test_setCode() {
        testCourse.setCode("0");
        assertEquals("0", testCourse.getCode());
    }

    /**
     * Verifies that toString returns the correct value
     */

    @Test
    public void test_toString(){
        Course testCourse = new Course("test","1234",1234,4);
        assertEquals("1234 1234 test (4)",testCourse.toString());
    }
}