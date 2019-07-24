package dealership;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer("Arnold CodeClan");
    }

    @Test
    public void canGetName() {
        assertEquals("Arnold CodeClan", dealer.getName());
    }
}
