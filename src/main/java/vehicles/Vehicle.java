package vehicles;

import components.Engine;
import components.Tyres;

public abstract class Vehicle {

    private ColourType colour;
    private int price;
    private Engine engine;
    private Tyres tyres;

    public Vehicle(ColourType colour, int price, Engine engine, Tyres tyres){
        this.colour = colour;
        this.price = price;
        this.engine = engine;
        this.tyres = tyres;
    }

    public ColourType getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
