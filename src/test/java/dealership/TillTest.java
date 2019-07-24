package dealership;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void before(){
        till = new Till("Till 1");
    }

    @Test
    public void canGetName() {
        assertEquals("Till 1", till.getName());
    }

    @Test
    public void canGetTillBalance() {
        assertEquals(100000, till.getTillBalance());
    }

    @Test
    public void canAddToTill() {
        till.addToBalance(10000);
        assertEquals(110000, till.getTillBalance());
    }

    @Test
    public void canReduceTill() {
        till.reduceBalance(10000);
        assertEquals(90000, till.getTillBalance());
    }
}
