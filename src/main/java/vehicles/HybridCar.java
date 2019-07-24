package vehicles;

import behaviours.ICar;
import components.Engine;
import components.Tyres;

public class HybridCar extends Vehicle implements ICar {
    public HybridCar(ColourType colour, int price, Engine engine, Tyres tyres) {
        super(colour, price, engine, tyres);
    }
}
