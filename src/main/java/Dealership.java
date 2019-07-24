import behaviours.ICar;
import dealership.Customer;
import dealership.Dealer;
import dealership.Till;
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

    public void removerCarFromDealership(){
        this.cars.remove(0);
    }

    public void sellCarToCustomer(ICar car){
        Vehicle vehicle = null;
        removerCarFromDealership();
        customer.addCarToCustomer(car);
        customer.reduceBudget(vehicle.getPrice());
        till.addToBalance(vehicle.getPrice());
    }
}
