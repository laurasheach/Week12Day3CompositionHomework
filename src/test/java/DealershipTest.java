import components.Engine;
import components.Tyres;
import dealership.Customer;
import dealership.Dealer;
import dealership.Till;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.ColourType;
import vehicles.ElectricCar;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Customer customer;
    Dealer dealer;
    Till till;
    Car car;
    HybridCar hybridCar;
    ElectricCar electricCar;
    Engine engine;
    Tyres tyres;


    @Before
    public void before(){
        dealer = new Dealer("Arnold CodeClan");
        customer = new Customer("Laura", 50000);
        till = new Till("Till 1");
        dealership = new Dealership(dealer, customer, till);
        engine = new Engine("BMW", 2.0);
        tyres = new Tyres("Bridgestone", 17);
        car = new Car(ColourType.BLACK, 40000, engine, tyres);
        hybridCar = new HybridCar(ColourType.BLACK, 40000, engine, tyres);
        electricCar = new ElectricCar(ColourType.BLACK, 40000, engine, tyres);

    }

    @Test
    public void canGetCarPrice() {
        assertEquals(40000, car.getPrice());
    }

    @Test
    public void carsStartsAt0() {
        assertEquals(0, dealership.getNumberOfCars());
    }

    @Test
    public void canAddCarToDealership() {
       dealership.addCarToDealership(car);
       dealership.addCarToDealership(hybridCar);
       dealership.addCarToDealership(electricCar);
       assertEquals(3, dealership.getNumberOfCars());
    }

    @Test
    public void canRemoveCarFromDealership() {
        dealership.addCarToDealership(car);
        dealership.addCarToDealership(hybridCar);
        dealership.addCarToDealership(electricCar);
        dealership.removeCarFromDealership(car);
        assertEquals(2, dealership.getNumberOfCars());
    }

    @Test
    public void canSellACar() {
        dealership.addCarToDealership(car);
        dealership.addCarToDealership(hybridCar);
        dealership.addCarToDealership(electricCar);
        dealership.sellCarToCustomer(car);
        assertEquals(2, dealership.getNumberOfCars());
        assertEquals(140000, till.getTillBalance());
        assertEquals(10000, customer.getBudget());
        assertEquals(1, customer.countCustomerCars());

    }

    @Test
    public void canBuyACar() {
        dealership.buyACar(car);
        assertEquals(1, dealership.getNumberOfCars());
        assertEquals(60000, till.getTillBalance());
    }
}
