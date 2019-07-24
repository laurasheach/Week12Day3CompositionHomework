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
}
