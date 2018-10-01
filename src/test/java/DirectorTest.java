import Staff.Management.Director;
import org.junit.Before;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Tony Stark", "5", 5000000.00, "Ironing");
    }
}
