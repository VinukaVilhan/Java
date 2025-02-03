interface PaymentMethod{
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Credit card payment of amount: " + amount);
    }
}

class PayPalPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("PayPal payment of amount: " + amount);
    }
}

class CashPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Cash payment of amount: " + amount);
    }
}



public class Main {
    public static void main(String[] args){
        PaymentMethod pp = new PayPalPayment();
        PaymentMethod cc = new CreditCardPayment();
        PaymentMethod cp = new CashPayment();

        pp.processPayment(10000);
        cc.processPayment(20000);
        cp.processPayment(30000);

    }    
}
