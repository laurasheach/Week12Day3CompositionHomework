package vehicles;

import behaviours.ICar;
import components.Engine;
import components.Tyres;

public class Car extends Vehicle implements ICar {

    public Car(ColourType colour, int price, Engine engine, Tyres tyres) {
        super(colour, price, engine, tyres);
    }
}
