package vehicles;

import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyres tyres;

    @Before 
    public void before(){
        engine = new Engine("BMW", 2.0);
        tyres = new Tyres("Bridgestone", 17);
        car = new Car(ColourType.BLACK, 40000, engine, tyres);
    }

    @Test
    public void canGetMake() {
        assertEquals(ColourType.BLACK, car.getColour());
    }

    @Test
    public void canGetPrice() {
        assertEquals(40000, car.getPrice());
    }

    @Test
    public void canGetEngineMake() {
        assertEquals("BMW", car.getEngine().getMake());
    }

    @Test
    public void canGetEngineSize() {
        assertEquals(2.0, car.getEngine().getSize());
    }

    @Test
    public void canGetTyreMake() {
        assertEquals("Bridgestone", car.getTyres().getMake());
    }

    @Test
    public void canGetTyreSize() {
        assertEquals(17.0, car.getTyres().getSize());
    }

    @Test
    public void canAdjustForDamage() {
        car.addDamage(1000);
        assertEquals(39000, car.getPrice());
    }

    @Test
    public void canAdjustForRepair(){
        car.addRepair(1000);
        assertEquals(41000, car.getPrice());
    }
}
