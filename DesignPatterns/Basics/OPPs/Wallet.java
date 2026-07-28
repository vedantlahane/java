package DesignPatterns.Basics.OPPs;

public class Wallet implements PaymentMethod {
    
    @Override
    public void pay() {
        System.out.println("Payment made using Wallet");
    }
}
