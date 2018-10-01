import Staff.TechStaff.DataBaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void setUp() throws Exception {
        dataBaseAdmin = new DataBaseAdmin("Jarvis", "S015JARV15", 1.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jarvis", dataBaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("S015JARV15", dataBaseAdmin.getnINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1.00, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canHaveSalaryRaise() {
        dataBaseAdmin.raiseSalary(1.00);
        assertEquals(2.00, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canHavePayBonus() {
        assertEquals(0.01, dataBaseAdmin.paybonus(), 0.001);
    }

    @Test
    public void payriseCantBeNegative() {
        dataBaseAdmin.raiseSalary(-1.00);
        assertEquals(1.00, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        dataBaseAdmin.setName("Vision");
        assertEquals("Vision", dataBaseAdmin.getName());
    }
}
