import Staff.TechStaff.DataBaseAdmin;
import org.junit.Before;
import org.junit.Test;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void setUp() throws Exception {
        dataBaseAdmin = new DataBaseAdmin("Jarvis", "S015JARV15", 1.00);
    }

}
