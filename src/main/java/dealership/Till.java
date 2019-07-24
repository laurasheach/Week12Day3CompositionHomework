package dealership;

public class Till extends Administration {

    private int balance;

    public Till(String name) {
        super(name);
        this.balance = 100000;
    }

    public int getTillBalance() {
        return this.balance;
    }

    public int addToBalance(int cash){
        return this.balance = this.balance + cash;
    }

    public int reduceBalance(int cash){
        return this.balance = this.balance - cash;
    }
}
