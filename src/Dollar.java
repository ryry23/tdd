package money;

public class Dollar {
    double amount;
    Dollar(double amount){
        this.amount = amount;
    }
    void times(double multiplier){
       amount *= multiplier;
    }
}
