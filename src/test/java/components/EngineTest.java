package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("BMW", 2.0);
    }

    @Test
    public void canGetMake() {
        assertEquals("BMW", engine.getMake());
    }

    @Test
    public void canGetSize() {
        assertEquals(2.0, engine.getSize(), 0.01);
    }
}
