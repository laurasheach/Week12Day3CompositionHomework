package vehicles;

import behaviours.ICar;
import components.Engine;
import components.Tyres;

public class ElectricCar extends Vehicle implements ICar {
    public ElectricCar(ColourType colour, int price, Engine engine, Tyres tyres) {
        super(colour, price, engine, tyres);
    }
}
