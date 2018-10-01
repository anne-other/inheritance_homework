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

    @Test
    public void hasSalary() {
        assertEquals(5000000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canHaveRaise() {
        director.raiseSalary(100000.00);
        assertEquals(5100000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canHavePayBonus() {
        assertEquals(50000.00, director.paybonus(), 0.01);
    }
}
