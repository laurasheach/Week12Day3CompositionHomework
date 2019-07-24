package dealership;

import behaviours.ICar;
import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer extends Administration {

    private ArrayList<ICar> customerCars;
    private int budget;

    public Customer(String name, int budget) {
        super(name);
        this.customerCars = new ArrayList<ICar>();
        this.budget = budget;
    }

    public ArrayList<ICar> getCustomerCars(){
        return customerCars;
    }

    public void addCarToCustomer(ICar car){
        this.customerCars.add(car);
    }

    public int countCustomerCars(){
        return this.customerCars.size();
    }

    public int getBudget() {
        return budget;
    }

    public int reduceBudget(int cash){
        return this.budget = this.budget - cash;
    }

    public int addToBalance(int cash){
        return this.budget = this.budget + cash;
    }
}
