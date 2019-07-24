package dealership;

public abstract class Administration {

    private String name;

    public Administration(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
