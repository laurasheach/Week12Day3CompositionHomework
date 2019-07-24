package dealership;

import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.ColourType;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        customer = new Customer("Laura", 50000);
        engine = new Engine("BMW", 2.0);
        tyres = new Tyres("Bridgestone", 17);
        car = new Car(ColourType.BLACK, 40000, engine, tyres);
    }

    @Test
    public void canGetName() {
        assertEquals("Laura", customer.getName());
    }

    @Test
    public void customerCarsStartAt0() {
        assertEquals(0, customer.countCustomerCars());
    }

    @Test
    public void canAddToCustomerCars() {
        customer.addCarToCustomer(car);
        assertEquals(1, customer.countCustomerCars());
    }

    @Test
    public void canGetBudget() {
        assertEquals(50000, customer.getBudget());
    }

    @Test
    public void canReduceBudget() {
        customer.reduceBudget(10000);
        assertEquals(40000, customer.getBudget());
    }

    @Test
    public void canAddToBalance() {
        customer.addToBalance(10000);
        assertEquals(60000, customer.getBudget());
    }
}
