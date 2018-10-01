import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DeveloperTest {
    
    Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("Bruce Banner", "H01K", 20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bruce Banner", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("H01K", developer.getnINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(20.00, developer.getSalary(), 0.01);
    }
}
