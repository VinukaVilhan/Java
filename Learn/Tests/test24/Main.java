interface PaymentGateway {
    void initiatePayment(double amount);
    void refund(double amount);
}

interface DigitalWallet{
    void addFunds(double amount);
    void transferFunds(double amount);
}

class PayPal implements PaymentGateway, DigitalWallet{
    private double balance;

    @Override
    public void initiatePayment(double amount){
        System.out.println("Payment of " + amount + " initiated using PayPal");
    } 

    @Override
    public void refund(double amount){
        System.out.println("Refund of " + amount + " initiated using PayPal");
    }

    @Override
    public void addFunds(double amount){
        balance += amount;
        System.out.println(amount + " added to your PayPal account");
    }

    @Override
    public void transferFunds(double amount){
        if (amount >= balance)
        {
            System.out.println("Insufficient balance");
        }
        else{
            balance -= amount;
            System.out.println(amount + " transferred from your PayPal account");
        }
    }
}

public class Main{
    public static void main(String args[]){
        PayPal myPayPal = new PayPal();
        myPayPal.addFunds(2000);
        myPayPal.initiatePayment(500);
        myPayPal.transferFunds(1000);
        myPayPal.refund(200);
    }
}