import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Tony Stark", "5", 5000000.00, "Ironing", 1000000000.00);
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

    @Test
    public void hasDeptName() {
        assertEquals("Ironing", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(1000000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void payriseCantBeNegative() {
        director.raiseSalary(-1.00);
        assertEquals(5000000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        director.setName("I AM Ironman");
        assertEquals("I AM Ironman", director.getName());
    }

    @Test
    public void nameCannotBeNull() {
        director.setName(null);
        assertNotNull(director.getName());
        assertEquals("Tony Stark", director.getName());
    }
}
