package dealership;

public class Till extends Administration {

    private int balance;

    public Till(String name) {
        super(name);
        this.balance = 0;
    }
}
