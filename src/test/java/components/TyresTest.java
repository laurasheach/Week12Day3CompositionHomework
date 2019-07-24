package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Bridgestone", 17);
    }

    @Test
    public void canGetMake() {
        assertEquals("Bridgestone", tyres.getMake());
    }

    @Test
    public void canGet() {

    }
}
