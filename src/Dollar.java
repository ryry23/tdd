package money;

public class Dollar {
    double amount;
    Dollar(double amount){
        this.amount = amount;
    }
    Dollar times(double multiplier) {
       return new Dollar(amount * multiplier);
    }
    public boolean equals (Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
