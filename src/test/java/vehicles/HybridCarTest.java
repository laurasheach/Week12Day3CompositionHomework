package vehicles;

import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("BMW", 2.0);
        tyres = new Tyres("Bridgestone", 17);
        hybridCar = new HybridCar(ColourType.BLACK, 40000, engine, tyres);
    }

    @Test
    public void canGetMake() {
        assertEquals(ColourType.BLACK, hybridCar.getColour());
    }

    @Test
    public void canGetPrice() {
        assertEquals(40000, hybridCar.getPrice());
    }

    @Test
    public void canGetEngineMake() {
        assertEquals("BMW", hybridCar.getEngine().getMake());
    }

    @Test
    public void canGetEngineSize() {
        assertEquals(2.0, hybridCar.getEngine().getSize());
    }

    @Test
    public void canGetTyreMake() {
        assertEquals("Bridgestone", hybridCar.getTyres().getMake());
    }

    @Test
    public void canGetTyreSize() {
        assertEquals(17.0, hybridCar.getTyres().getSize());
    }

}
