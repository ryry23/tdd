package money;

public class Dollar {
    double amount;
    Dollar(double amount){
        this.amount = amount;
    }
    Dollar times(double multiplier){
       return new Dollar(amount * multiplier);
    }
}
