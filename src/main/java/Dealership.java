import behaviours.ICar;
import dealership.Customer;
import dealership.Dealer;
import dealership.Till;
import vehicles.Car;
import vehicles.ColourType;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private Dealer dealer;
    private Customer customer;
    private Till till;
    private ArrayList<ICar> cars;

    public Dealership(Dealer dealer, Customer customer, Till till){
        this.dealer = dealer;
        this.customer = customer;
        this.till = till;
        this.cars = new ArrayList<ICar>();
    }

    public Dealer getDealer() {
        return dealer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Till getTill() {
        return till;
    }

    public ArrayList<ICar> getCars() {
        return cars;
    }

    public int getNumberOfCars(){
        return this.cars.size();
    }

    public void addCarToDealership(ICar car){
        this.cars.add(car);
    }

    public void removeCarFromDealership(ICar car){
        this.cars.remove(car);
    }

    public void sellCarToCustomer(ICar car){
        Vehicle vehicle = (Vehicle) car;
        removeCarFromDealership(car);
        customer.addCarToCustomer(car);
        customer.reduceBudget(vehicle.getPrice());
        till.addToBalance(vehicle.getPrice());
    }

    public void buyACar(ICar car){
        Vehicle vehicle = (Vehicle) car;
        if(till.getTillBalance() > vehicle.getPrice()) {
            addCarToDealership(car);
            till.reduceBalance(vehicle.getPrice());
        }
    }
}
