package vehicles;

import components.Engine;
import components.Tyres;

public abstract class Vehicle {

    private ColourType colour;
    private int price;
    private Engine engine;
    private Tyres tyres;
    private int damage;
    private int repair;

    public Vehicle(ColourType colour, int price, Engine engine, Tyres tyres){
        this.colour = colour;
        this.price = price;
        this.engine = engine;
        this.tyres = tyres;
        this.damage = 0;
        this.repair = 0;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int addDamage(int addDamage){
        setDamage(addDamage);
        return this.price = this.price - this.damage;
    }

    public int getRepair() {
        return repair;
    }

    public void setRepair(int repair) {
        this.repair = repair;
    }

    public int addRepair(int addRepair){
        setRepair(addRepair);
        return this.price = this.price + this.repair;
    }


}
