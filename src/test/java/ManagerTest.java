import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Pepper Potts","AV3N63R", 1000000.00, "Assembling");
    }

    @Test
    public void hasName() {
        assertEquals("Pepper Potts", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("AV3N63R", manager.getnINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1000000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSallary() {
        manager.raiseSalary(100.00);
        assertEquals(1000100.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(10000.00, manager.paybonus(), 0.01);
    }

    @Test
    public void hasDept() {
        assertEquals("Assembling", manager.getDeptName());
    }
}
