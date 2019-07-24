package vehicles;

import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("BMW", 2.0);
        tyres = new Tyres("Bridgestone", 17);
        electricCar = new ElectricCar(ColourType.BLACK, 40000, engine, tyres);
    }

    @Test
    public void canGetMake() {
        assertEquals(ColourType.BLACK, electricCar.getColour());
    }

    @Test
    public void canGetPrice() {
        assertEquals(40000, electricCar.getPrice());
    }

    @Test
    public void canGetEngineMake() {
        assertEquals("BMW", electricCar.getEngine().getMake());
    }

    @Test
    public void canGetEngineSize() {
        assertEquals(2.0, electricCar.getEngine().getSize());
    }

    @Test
    public void canGetTyreMake() {
        assertEquals("Bridgestone", electricCar.getTyres().getMake());
    }

    @Test
    public void canGetTyreSize() {
        assertEquals(17.0, electricCar.getTyres().getSize());
    }

}
