package components;

public abstract class Component {

    private String make;
    private double size;

    public Component(String make, double size){
        this.make = make;
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public double getSize() {
        return size;
    }
}
