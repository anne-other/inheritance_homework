import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Tony Stark", "5", 5000000.00, "Ironing");
    }

    @Test
    public void hasName() {
        assertEquals("Tony Stark", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("5", director.getnINumber());
    }
}
